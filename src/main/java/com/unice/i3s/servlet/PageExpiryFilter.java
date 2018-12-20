package com.unice.i3s.servlet;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class PageExpiryFilter implements javax.servlet.Filter {

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    private Map<String, Integer> pathRegex;

    public void destroy() {
        // no resources to be released
    }

    /**
     * The doFilter method of the Filter is called by the container each time a
     * request/response pair is passed through the chain due to a client request
     * for a resource at the end of the chain.
     */
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        if (response instanceof HttpServletResponse) {
            if (request instanceof HttpServletRequest) {
                HttpServletRequest httpServletRequest = (HttpServletRequest) request;
                String path = httpServletRequest.getServletPath();
                HttpServletResponse httpServletResponse = (HttpServletResponse) response;

                String expiryDate = null;
                String lastModified = null;

                for (String regex : pathRegex.keySet()) {
                    if (path.matches(regex)) {
                        Integer age = pathRegex.get(regex);
                        // expiry date
                        {
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(Calendar.MINUTE, age);

                            expiryDate = new SimpleDateFormat(
                                    "EEE, dd MMM yyyy HH:mm:ss z")
                                    .format(calendar.getTime());
                            httpServletResponse.setHeader("Expires", expiryDate);
                            log().debug("expiration date set for path: " + path + " = " + expiryDate);
                        }

                        break;
                    }
                }

            }
        }

        // chain.doFilter() should be called after writing the header. If it is
        // called _before_ writing the header
        chain.doFilter(request, response);
    }

    /**
     * Get the expiry header to set for the given path
     *
     * @param path
     *            the relative path of the resource within the application. e.g.
     *            /images/logo.png
     *
     * @return the expiry header formatted as "EEE, dd MMM yyyy HH:mm:ss z", or
     *         null if no expiry date has been specified
     */
    private String getExpiryHeaderFor(String path) {
        for (String regex : pathRegex.keySet()) {
            if (path.matches(regex)) {
                Integer age = pathRegex.get(regex);
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MINUTE, age);

                return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z")
                        .format(calendar.getTime());
            }
        }

        return null;
    }

    /**
     * Called by the web container to indicate to a filter that it is being
     * placed into service.
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        pathRegex = new LinkedHashMap<String, Integer>();

        Properties properties = new Properties();

        String resourceName = "/expires.properties";

        InputStream inputStream = getClass().getResourceAsStream(resourceName);

        if (inputStream != null) {
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                throw new ServletException(
                        "Error while opening classpath resource '"
                                + resourceName
                                + "'. Make sure that it is a valid properties",
                        e);
            }
        }

        for (Object key : properties.keySet()) {
            String regex = (String) key;
            String value = properties.getProperty(regex);

            if (value != null && value.length() == 0) {
                value = null;
            }

            Integer expInMinutes = getExpirationInMinutes(value);

            pathRegex.put(String.valueOf(key), expInMinutes);
        }
    }

    static Integer getExpirationInMinutes(String value) {
        if (value == null) {
            return null;
        }
        value = value.trim();
        if (value.length() == 0) {
            return null;
        }
        Pattern pattern = Pattern.compile("^(\\d+)(m|M|h|d|w)$");
        Matcher m = pattern.matcher(value);
        if (m.matches()) {
            int val = Integer.parseInt(m.group(1));
            String denomination = m.group(2);
            int factor;
            if (denomination.equals("m")) {
                factor = 1;
            } else if (denomination.equals("h")) {
                factor = 60;
            } else if (denomination.equals("d")) {
                factor = 60 * 24;
            } else if (denomination.equals("M")) {
                factor = 60 * 24 * 30;
            } else if (denomination.equals("w")) {
                factor = 60 * 24 * 7;
            } else {
                throw new RuntimeException(
                        "Developer error. Unhandled pattern '" + value + "'"
                                + " for '" + value
                                + "'. Valid patterns are 2m, 10h, 1d, 1w, 1M");
            }

            return val * factor;
        } else {
            throw new RuntimeException(
                    "Invalid pattern '"
                            + value
                            + "'"
                            + " for '"
                            + value
                            + "'. Valid patterns are '2m' for 2 minutes, '10h' for 10 hours, '1d' for 1 day, '1w' for 1 week, '1M' for 1 month");
        }
    }
}