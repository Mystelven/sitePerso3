package com.polytech.mystelven.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Represent the controller to get the name of the application.
 */
@Named("app")
@ApplicationScoped
public class ApplicationController {

    private static final long serialVersionUID = 0x2c54934093487L;
    
    /**
     * This string represents the name of the Application
     */
	private static final String applicationName;

    /**
     * We realize the affection in a static block because the attribute is static
     */
    static {
        applicationName = "Valentin Montmirail";
    }

    /**
     * This function is the getter of our application's name
     * @return the name of the application
     */
    public String getApplicationName() {
		return applicationName;
	}
    

}
