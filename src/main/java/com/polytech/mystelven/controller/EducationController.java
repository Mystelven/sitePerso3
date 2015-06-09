package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.EducationModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by mystelven on 01/03/2015.
 */
@Named("education")
@ApplicationScoped
public class EducationController extends TableController {

    private static final long serialVersionUID = 0x3293349024830948L;
    
    private String nbEducation = "0";

    public EducationController() {
        
        log().info("EducationController() -- IN");
        
        tableModel     = EducationModel.getEducationModel();

        log().info("EducationController() -- OUT");
    }
    
    public String getNbEducation() { return new Integer(Integer.parseInt(((EducationModel)tableModel).getNbEducation())-1).toString(); }
    
    public String getName(int i) {
        return ((EducationModel)tableModel).getNames().get(i);
    }

    public String getDescription(int i) {
        return ((EducationModel)tableModel).getDescriptions().get(i);
    }

    public String getLogo(int i) {
        return ((EducationModel)tableModel).getLogo().get(i);
    }

    public String getDate(int i) {
        return ((EducationModel)tableModel).getDates().get(i);
    }
    

}
