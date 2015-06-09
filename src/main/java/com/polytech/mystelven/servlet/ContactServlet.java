package com.polytech.mystelven.servlet;

import org.apache.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mystelven on 06/03/2015.
 */
@Named("contactServlet")
@ApplicationScoped
public class ContactServlet extends HttpServlet {

    public static String getName() {
        return "contact";
    }

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        log().info("doGet() -- IN");

        RequestDispatcher view = request.getRequestDispatcher("contact.jsf");

        try {

            view.forward(request, response);

        } catch (ServletException e) {

            log().error("doGet() -- ServletException" + e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {

            log().error("doGet() -- ServletException"+e.getMessage());
            e.printStackTrace();
        }

        log().info("doGet() -- OUT");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        doGet(request,response);
    }
}
