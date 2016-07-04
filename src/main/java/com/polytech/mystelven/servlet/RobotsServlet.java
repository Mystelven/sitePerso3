package com.polytech.mystelven.servlet;

import org.apache.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mystelven on 13/06/2015.
 */
@Named("RobotsServlet")
@ApplicationScoped
public class RobotsServlet extends HttpServlet {

    public static String getName() {
        return "robots.txt";
    }

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {


        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            log().error(e.getMessage());
        }

        writer.write("User-agent: *\n" +
                "Sitemap: http://valentin-montmirail.com/Sitemap.xml");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        doGet(request,response);
    }
}
