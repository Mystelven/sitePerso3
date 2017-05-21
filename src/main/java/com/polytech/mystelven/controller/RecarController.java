package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.RecarModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by mystelven on 01/03/2015.
 */
@Named("recar")
@ApplicationScoped
public class RecarController extends TableController {

    private static final long serialVersionUID = 0x3293349024830948L;

    private String nbEducation = "0";

    public RecarController() {
        
        log().info("RecarController() -- IN");

        tableModel = RecarModel.getRecarModel();

        log().info("RecarController() -- OUT");
    }
    


}
