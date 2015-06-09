package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.EducationModel;
import com.polytech.mystelven.model.ProjectModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by mystelven on 03/03/2015.
 */
@Named("project")
@ApplicationScoped
public class ProjectController extends TableController {

    private String nbProject = "0";

    public ProjectController() {

        log().info("ProjectController() -- IN");

        tableModel     = ProjectModel.getProjectModel();

        log().info("ProjectController() -- OUT");
    }

    public String getNbProject() { return new Integer(Integer.parseInt(((ProjectModel)tableModel).getNbProject())-1).toString(); }

    public String getName(int i) {
        return ((ProjectModel)tableModel).getNames().get(i);
    }

    public String getDescription(int i,boolean complete) {

        String result = ((ProjectModel)tableModel).getDescriptions().get(i);

        if(complete) {

            return result.replace("|End|","");
        }
        else {

            int end = result.indexOf("|End|");

            if(end == -1) end = result.length();

            return result.substring(0,end);
        }


    }

    public String getImage(int i) { return ((ProjectModel)tableModel).getImages().get(i); }

}
