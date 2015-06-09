package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.EducationModel;
import com.polytech.mystelven.model.ProjectModel;
import com.polytech.mystelven.model.ResearchModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by mystelven on 01/03/2015.
 */
@Named("research")
@ApplicationScoped
public class ResearchController extends TableController {

    private static final long serialVersionUID = 0x3293349024830948L;

    private String nbEducation = "0";

    public ResearchController() {
        
        log().info("ResearchController() -- IN");

        tableModel     = ResearchModel.getResearchModel();

        log().info("ResearchController() -- OUT");
    }
    


}
