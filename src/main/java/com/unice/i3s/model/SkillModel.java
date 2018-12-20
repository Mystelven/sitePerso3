package com.unice.i3s.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 01/03/2015.
 */
public class SkillModel extends TableModel {

    private String[] colors= {"pomengrate", "asbestos", "sunflower",  "wisteria",  "emerald",  "carrot"};

    private static final long serialVersionUID = 0x2c545346d87L;

    public ArrayList<String> getWebs(String field) {

        ArrayList<String> webs = new ArrayList<String>();

        if(field == "name_color")
        {
            for(int i = 0; i < Integer.parseInt(this.getNbWeb()); i++)
            {
                webs.add(colors[i%colors.length]);
            }
        }

        if(field == "value_skill")
        {
            webs.add("90");
            webs.add("80");
            webs.add("100");
        }

        if(field == "name_skill")
        {
            webs.add("PHP (Zend Framework, Symfony)");
            webs.add("JavaScript (JQuery, Mootools)");
            webs.add("HTML5 / CSS3");
        }

        return webs;
    }

    public ArrayList<String> getSoftwares(String field) {

        ArrayList<String> softwares = new ArrayList<String>();

        if(field == "name_color")
        {
            for(int i = 0; i < Integer.parseInt(getNbSoftware()); i++)
            {
                softwares.add(colors[i%colors.length]);
            }
        }

        if(field == "value_skill")
        {
            softwares.add("100");
            softwares.add("85");
            softwares.add("70");
            softwares.add("90");
            softwares.add("20");
            softwares.add("60");

        }

        if(field == "name_skill")
        {
            softwares.add("Java (Swing, AWT)");
            softwares.add("JavaEE (Spring, Tapestry, CDI)");
            softwares.add("C (GTK+, OpenGL, Glut)");
            softwares.add("C++ (Qt,SFML)");
            softwares.add("C# (.NET)");
            softwares.add("Android");
        }


        return softwares;
    }

    public ArrayList<String> getLanguages(String field) {

        ArrayList<String> languages = new ArrayList<String>();

        if(field == "name_color")
        {
            for(int i = 0; i < Integer.parseInt(this.getNbLanguage()); i++)
            {
                languages.add(colors[i%colors.length]);
            }
        }

        if(field == "value_skill")
        {
            languages.add("100");
            languages.add("100");
            languages.add("30");
            languages.add("40");
        }

        if(field == "name_skill")
        {
            languages.add("French");
            languages.add("English");
            languages.add("Italian");
            languages.add("Polish");
        }

        return languages;
    }

    public ArrayList<String> getDatabases(String field) {

        ArrayList<String> databases = new ArrayList<String>();

        if(field == "name_color")
        {
            for(int i = 0; i < Integer.parseInt(this.getNbDatabases()); i++)
            {
                databases.add(colors[i%colors.length]);
            }
        }

        if(field == "value_skill")
        {
            databases.add("80");
            databases.add("80");
            databases.add("90");
            databases.add("90");
        }

        if(field == "name_skill")
        {
            databases.add("Microsoft Access");
            databases.add("MySQL");
            databases.add("PostGreSQL");
            databases.add("Oracle");
        }

        return databases;
    }

    public ArrayList<String> getManagements(String field) {

        ArrayList<String> managements = new ArrayList<String>();

        if(field == "name_color")
        {
            for(int i = 0; i < Integer.parseInt(this.getNbManagement()); i++)
            {
                managements.add(colors[i%colors.length]);
            }
        }

        if(field == "value_skill")
        {
            managements.add("100");
            managements.add("90");
            managements.add("90");
            managements.add("90");
            managements.add("80");
        }

        if(field == "name_skill")
        {
            managements.add("Versioning (Git, SVN, Mercurial)");
            managements.add("Jenkins/Bamboo/GitLab | Sonar");
            managements.add("Agile Methodology");
            managements.add("TDD (JUnit, Cppcheck)");
            managements.add("UML/Merise");
        }

        return managements;
    }


    public ArrayList<String> getSkills() {

        ArrayList<String> skills = new ArrayList<String>();

        skills.addAll(this.getSoftwares("name_skill"));
        skills.addAll(this.getWebs("name_skill"));
        skills.addAll(this.getDatabases("name_skill"));
        skills.addAll(this.getManagements("name_skill"));
        skills.addAll(this.getLanguages("name_skill"));

        return skills;
    }

    public ArrayList<String> getColors() {

        ArrayList<String> colors = new ArrayList<String>();

        colors.addAll(this.getSoftwares("name_color"));
        colors.addAll(this.getWebs("name_color"));
        colors.addAll(this.getDatabases("name_color"));
        colors.addAll(this.getManagements("name_color"));
        colors.addAll(this.getLanguages("name_color"));

        return colors;
    }

    public ArrayList<String> getValues() {

        ArrayList<String> values = new ArrayList<String>();

        values.addAll(this.getSoftwares("value_skill"));
        values.addAll(this.getWebs("value_skill"));
        values.addAll(this.getDatabases("value_skill"));
        values.addAll(this.getManagements("value_skill"));
        values.addAll(this.getLanguages("value_skill"));

        return values;
    }

    public String getNbSoftware() {

        return "6";
    }

    public String getNbWeb() {

        return "3";
    }

    public String getNbLanguage() {

        return "4";
    }

    public String getNbDatabases() {

        return "4";
    }

    public String getNbManagement() {

        return "5";
    }
}

