package com.unice.i3s.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.unice.i3s.model.ScientificProductionModel;

import java.util.ArrayList;

/**
 * Created by mystelven on 29/07/2015.
 */
@Named("scientificProduction")
@ApplicationScoped
public class ScientificProductionsController extends TableController {

    public ScientificProductionsController() {

        log().info("ProjectController() -- IN");

        tableModel     = ScientificProductionModel.getProjectModel();

        log().info("ProjectController() -- OUT");
    }

    public String getNbProject() { return new Integer(Integer.parseInt(((ScientificProductionModel)tableModel).getNbProject())-1).toString(); }

    public String getName(int i) {
        return ((ScientificProductionModel)tableModel).getNames().get(i);
    }

    public String getDescription(int i,boolean complete) {

        String result = ((ScientificProductionModel)tableModel).getDescriptions().get(i);

        if(complete) {

            return result.replace("|End|","");
        }
        else {

            int end = result.indexOf("|End|");

            if(end == -1) end = result.length();

            return result.substring(0,end);
        }
    }

    public String getImage(int i) { return ((ScientificProductionModel)tableModel).getImages().get(i); }

    public String getId(int i) { return ((ScientificProductionModel)tableModel).getId().get(i); }

    public String getDateProject(int i) { return ((ScientificProductionModel)tableModel).getDateProject().get(i); }

    public String getCategory(int i) { return ((ScientificProductionModel)tableModel).getCategory().get(i); }

    public String getIndexFromId(int id) {

        ArrayList<String> ids = ((ScientificProductionModel)tableModel).getId();

        for(Integer i = 0; i < ids.size() ; i++) {

            if(Integer.valueOf(ids.get(i)) == id) {
                return i.toString();
            }
        }

        return "-1";
    }

}


