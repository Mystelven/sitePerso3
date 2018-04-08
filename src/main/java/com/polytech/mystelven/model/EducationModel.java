package com.polytech.mystelven.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by mystelven on 01/03/2015.
 */
public class EducationModel extends TableModel {

    private static final long serialVersionUID = 0x2c546d89L;
    
    private static EducationModel INSTANCE = new EducationModel();

    /* The class ExperienceModel is a Singleton, we don't need multi-instance to perform requests */
    public static EducationModel getEducationModel() { return INSTANCE; }
    
    private EducationModel() {

        log().info("EducationModel() -- IN");

        log().info("EducationModel() -- OUT");
    }
    
    public String getNbEducation() {

        return "5";
    }

    public ArrayList<String> getNames() {
        
        ArrayList<String> names = new ArrayList<String>();

        names.add("Centre de Recherche en Informatique de Lens (Lens - France)");

        names.add("Politechnika Lódzka (Lódz - Poland)");

        names.add("École Polytechnique de l’Université de Tours (Tours - France)");

        names.add("UQAM (Montreal - Canada)");

        names.add("IUT de Lens (Lens - France)");

        return names;
    }

    public ArrayList<String> getDescriptions() {

        ArrayList<String> descriptions = new ArrayList<String>();

        descriptions.add("I'm doing my Ph.D in Artificial Intelligence.<br />\n" +
                "The thesis subject : Practical resolution of the coherence of formulas in modal logic. ");

        descriptions.add("Winter semester in the International Faculty of Engineering inside the Erasmus program.");

        descriptions.add("Obtention of an engineering degree in Computer Science.");

        descriptions.add("Winter semester in Bachelor of Software Engineering.");

        descriptions.add("Obtention an University Diploma of Technology in Computer Science.");

        return descriptions;
    }

    public ArrayList<String> getDates() {

        ArrayList<String> dates = new ArrayList<String>();

        dates.add("2015 - 2018");

        dates.add("2014 - 2014");

        dates.add("2012 - 2015");

        dates.add("2012 - 2012");

        dates.add("2010 - 2012");

        return dates;
    }

    public ArrayList<String> getLogo() {

        ArrayList<String> logos = new ArrayList<String>();

        logos.add("resources/images/cril.png");

        logos.add("resources/images/polLodzka.png");

        logos.add("resources/images/polytech.png");

        logos.add("resources/images/uqam.png");

        logos.add("resources/images/iutLens.png");

        return logos;
    }

    public ArrayList<String> getCurrent() {

        log().info("getCurrent() -- IN");

        ArrayList<String> current = new ArrayList<String>();

        current.add("true");

        current.add("false");

        current.add("false");

        current.add("false");

        current.add("false");

        log().info("getCurrent() -- OUT");

        return current;
    }

}
