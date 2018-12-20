package com.unice.i3s.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 02/03/2015.
 */
public class ExperienceModel extends TableModel {

    private static final long serialVersionUID = 0x2c546d88L;
    
    private static ExperienceModel INSTANCE = new ExperienceModel();

    /**
     * The class ExperienceModel is a Singleton, we don't need multi-instance to perform requests  
     * @return the only-possible instance of ExperienceModel
     */
    public static ExperienceModel getExperienceModel() { return INSTANCE; }
    
    private ExperienceModel() {

        log().info("ExperienceModel() -- IN");

        log().info("ExperienceModel() -- OUT");
    }

    public ArrayList<String> getNames(boolean personal) {
        
        log().info("getNames() -- IN");

        ArrayList<String> names = new ArrayList<String>();

        if(!personal) {

            names.add("Immojeune (Paris - France)");

            names.add("Worldline (Tours - France)");

            names.add("Axa-Assistance Canada (Montreal - Canada)");

            names.add("Axa-Assistance Canada (Montreal - Canada)");

            names.add("CHRU (Tours - France)");

            names.add("Atos (Wroclaw - Poland)");

            names.add("gPartner (Paris - France)");

        } else {

            names.add("Simply Créat' (Tours - France)");

            names.add("Event's organisation (Douai - France)");
        }

        log().info("getNames() -- OUT");
        
        return names;
    }

    public ArrayList<String> getDescriptions(boolean personal) {

        log().info("getDescriptions() -- IN");

        ArrayList<String> descriptions = new ArrayList<String>();

        if(!personal)
        {

            descriptions.add("Performing an integratable Iframe on all its partners for Immojeune. I co-managed the development in Symfony 2 and the versioning (git).");

            descriptions.add("Perform the comparison and merging management projects prepaid accounts and receipts of items to achieve a complete software, generic and reusable.");

            descriptions.add("Continuing the Intern website with Zend Framework started 1 year earlier.");

            descriptions.add("Internship at AXA Assistance Canada, to create an internal website in PHP 5.3 and Zend Framework, the goal was the merger of several existing sites so that field agents no longer uses a single intranet to access everything they need.");

            descriptions.add("The goal of this project was to realize a web platform who allow different hospitals to upload their DICOM files.\n" +
                    "\n" +
                    "Theses DICOM files contains the patient's name and to fix this problem, we integrate a JavaFX application to anonymize theses files.");

            descriptions.add("My role as a Java EE Developer (with French knowledge) was to design and\n" +
                    "implement a software in Java technologies and work on projects with French-speaking clients.");

            descriptions.add("I was working with 2 others differents companies on the website of a very famous company in the luxe industry to integrate desktop and mobile versions.");

        } else {

            descriptions.add("Co-director of the company Simply Créat’, I was often asked to quantify and control the\n" +
                    "realized projects and to take care of customer relationships");

            descriptions.add("Organizing concerts (human and technical constraints) and writing business plans as treasurer\n" +
                    "whether within les Binoclards or the Club Music of Polytech Tours.");
        }

        log().info("getDescriptions() -- OUT");
        
        return descriptions;
    }

    public ArrayList<String> getDates(boolean personal) {

        log().info("getDates() -- IN");

        ArrayList<String> dates = new ArrayList<String>();

        if(!personal)
        {

            dates.add("July 2015 - August 2015");

            dates.add("May 2015 - September 2015");

            dates.add("December 2014 - March 2015");

            dates.add("May 2012 - August 2012");

            dates.add("June 2013 - August 2013");

            dates.add("July 2014 - August 2014");

            dates.add("August 2014 - Sept. 2014");

        } else {

            dates.add("January 2014 - August 2015");

            dates.add("January 2011 - April 2015");
        }

        log().info("getDates() -- OUT");
        
        return dates;
    }

    /**
     * This function is able to get the number of experience (personal and not) inside the Database
     * @param personal to know if we want the number of personal or non personal experience
     * @return the number of experience (depends of the category that we want)
     */
    public String getNbExperiences(boolean personal) {

        log().info("getNbExperiences() -- IN");

        String nbExp = "0";
        
        if(!personal)
            nbExp = "7";
        else
            nbExp = "2";

        return nbExp;
    }


    public ArrayList<String> getCurrent() {

        log().info("getDescriptions() -- IN");

        ArrayList<String> current = new ArrayList<String>();

        current.add("false");
        current.add("false");
        current.add("false");
        current.add("false");
        current.add("false");
        current.add("false");
        current.add("false");

        current.add("false");
        current.add("false");

        log().info("getDescriptions() -- OUT");

        return current;
    }
}
