package com.polytech.mystelven.servlet;

import com.polytech.mystelven.controller.ProjectController;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mystelven on 05/03/2015.
 */
@Named("projectServlet")
@ApplicationScoped
public class ProjectServlet extends HttpServlet {
    
    public static String getName() {
        return "projects";
    }

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        
        log().info("doGet() -- IN");

        int page = 1;
        int recordsPerPage = 3;
        
        int end = 0;

        ProjectController projectController = new ProjectController();
        int nbProject = Integer.parseInt(projectController.getNbProject()) + 1;
        
        if(request.getParameter("page") != null)
            page = Integer.parseInt(request.getParameter("page"));

        double maxPage = (nbProject/recordsPerPage*1.0);
        
        log().info("doGet() -- We are on the page : "+page);
        log().info("doGet() -- We have : "+nbProject+" projects to display");
        log().info("doGet() -- We want : "+recordsPerPage+" projects by page");
        log().info("doGet() -- We will so have "+maxPage+ " pages");
        
        request.setAttribute("currentPage", page);
        request.setAttribute("nbProject", nbProject);
        
        int lastPage = (int)((nbProject/recordsPerPage*1.0));

        boolean testLastPage = page < lastPage;
        boolean testBeginPage = page > 1;

        request.setAttribute("testBeginPage", testBeginPage);
        request.setAttribute("testLastPage", testLastPage);
        
        int start = (recordsPerPage*page - (recordsPerPage-1))-1;
        
        request.setAttribute("start", start);
        
        if(start + recordsPerPage < Integer.parseInt(projectController.getNbProject())) {
            
            end = (start + recordsPerPage)-1;
            
        } else { /* Last page */
            
            end = (Integer.parseInt(projectController.getNbProject()))-1;
        }
        
        request.setAttribute("end",   end);

        boolean testOk = (start >= 0 && end <= nbProject);

        request.setAttribute("testOk", testOk);
        
        RequestDispatcher view = null;
        
        if(page <= maxPage && page >= 1)
            view = request.getRequestDispatcher("realisations.jsf");
        else 
            view = request.getRequestDispatcher("error/404.jsf");
        
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

            this.doGet(request,response);

        log().info("doPost() -- OUT");
    }
}
