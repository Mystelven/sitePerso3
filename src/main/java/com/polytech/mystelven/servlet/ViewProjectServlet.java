package com.polytech.mystelven.servlet;

import org.jboss.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mystelven on 08/03/2015.
 */
public class ViewProjectServlet extends HttpServlet {

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        log().info("doGet() -- IN");

        int project     = -1;
        int currentPage =  1;

        if(request.getParameter("project") != null)
            project = Integer.parseInt(request.getParameter("project"));



        RequestDispatcher view = null;

        log().info("We want more informations about the project number : "+project);

        if(project != -1) {
            view = request.getRequestDispatcher("viewProject.jsf");
            currentPage = (project/3)+1;
            request.setAttribute("currentPage", currentPage);
            request.setAttribute("i", project);
        } else {
            view = request.getRequestDispatcher("realisations.jsf");
        }

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

        log().info("doPost() -- IN");

            doGet(request,response);

        log().info("doPost() -- OUT");
    }
}
