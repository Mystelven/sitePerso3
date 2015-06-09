package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.ExperienceModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;

/**
 * Created by mystelven on 02/03/2015.
 */
@Named("experience")
@ApplicationScoped
public class ExperienceController extends TableController {

    private static final long serialVersionUID = 0x2323290439047034L;

    public ExperienceController() {

        log().info("ExperienceController() -- IN");

            log().info("ExperienceController() -- We instantiate our TableModel ");
            tableModel = ExperienceModel.getExperienceModel();

        log().info("ExperienceController() -- OUT");
    }

    public String getNbExperience(boolean personal) { 
        
        if(!personal)
            return new Integer(Integer.parseInt(((ExperienceModel)tableModel).getNbExperiences(false))-1).toString();
        else
            return new Integer(Integer.parseInt(((ExperienceModel)tableModel).getNbExperiences(true))-1).toString();
    }

    public String getName(boolean personal,int i) {
        
        if(!personal)
            return ((ExperienceModel)tableModel).getNames(false).get(i);
        else
            return ((ExperienceModel)tableModel).getNames(true).get(i);
        
    }

    public String getDescription(boolean personal, int i) {
        
        if(!personal)
            return ((ExperienceModel)tableModel).getDescriptions(false).get(i);
        else
            return ((ExperienceModel)tableModel).getDescriptions(true).get(i);
    }

    public String getDate(boolean personal, int i) {

        if(!personal)
            return ((ExperienceModel)tableModel).getDates(false).get(i);
        else
            return ((ExperienceModel)tableModel).getDates(true).get(i);
    }
}
