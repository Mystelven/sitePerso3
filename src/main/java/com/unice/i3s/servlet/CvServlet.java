package com.unice.i3s.servlet;

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
@Named("cvServlet")
@ApplicationScoped
public class CvServlet extends HttpServlet {

    public static String getName() {
        return "curriculum-vitae";
    }

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        log().info("doGet() -- IN");

        RequestDispatcher view = request.getRequestDispatcher("cv.jsf");

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
