package com.polytech.mystelven.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 01/03/2015.
 */
public class SkillModel extends TableModel {

    private static final long serialVersionUID = 0x2c545346d87L;

    public ArrayList<String> getSkills() {
        
        ArrayList<String> skills = new ArrayList<String>();

        skills.addAll(this.getSoftwares("name_skill"));
        skills.addAll(this.getWebs("name_skill"));
        skills.addAll(this.getDatabases("name_skill"));
        skills.addAll(this.getManagements("name_skill"));
        skills.addAll(this.getLanguages("name_skill"));

        return skills;
    }

    public ArrayList<String> getWebs(String field) {

        ArrayList<String> webs = new ArrayList<String>();

        String query = "select `"+field+"` from Skill NATURAL JOIN CategorySkill NATURAL JOIN Color  WHERE `id_category` = '2';";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                String nameSkill = rs.getString(field);
                webs.add(nameSkill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return webs;
    }

    public ArrayList<String> getSoftwares(String field) {

        ArrayList<String> softwares = new ArrayList<String>();

        String query = "select `"+field+"` from Skill NATURAL JOIN CategorySkill NATURAL JOIN Color  WHERE `id_category` = '1';";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                String nameSkill = rs.getString(field);
                softwares.add(nameSkill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return softwares;
    }

    public ArrayList<String> getLanguages(String field) {

        ArrayList<String> languages = new ArrayList<String>();

        String query = "select `"+field+"`  from Skill NATURAL JOIN CategorySkill NATURAL JOIN Color WHERE `id_category` = '3';";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                String nameSkill = rs.getString(field);
                languages.add(nameSkill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return languages;
    }

    public ArrayList<String> getDatabases(String field) {

        ArrayList<String> languages = new ArrayList<String>();

        String query = "select `"+field+"` from Skill NATURAL JOIN CategorySkill NATURAL JOIN Color WHERE `id_category` = '4';";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                String nameSkill = rs.getString(field);
                languages.add(nameSkill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return languages;
    }

    public ArrayList<String> getManagements(String field) {

        ArrayList<String> languages = new ArrayList<String>();

        String query = "select `"+field+"` from Skill NATURAL JOIN CategorySkill NATURAL JOIN Color WHERE `id_category` = '5';";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                String nameSkill = rs.getString(field);
                languages.add(nameSkill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return languages;
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

        String query = "SELECT COUNT(*) as nbSoft FROM Skill WHERE `id_category` = '1';";

        Statement st = getConnector().getStatement();

        String nbSoft = "0";

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbSoft = rs.getString("nbSoft");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nbSoft;
    }

    public String getNbWeb() {

        String query = "SELECT COUNT(*) as nbWeb FROM Skill WHERE `id_category` = '2';";

        Statement st = getConnector().getStatement();

        String nbWeb = "0";

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbWeb = rs.getString("nbWeb");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nbWeb;
    }

    public String getNbLanguage() {

        String query = "SELECT COUNT(*) as nbLanguages FROM Skill WHERE `id_category` = '3';";

        Statement st = getConnector().getStatement();

        String nbLanguages = "0";

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbLanguages = rs.getString("nbLanguages");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nbLanguages;
    }

    public String getNbDatabases() {

        String query = "SELECT COUNT(*) as nbDatabases FROM Skill WHERE `id_category` = '4';";

        Statement st = getConnector().getStatement();

        String nbDatabases = "0";

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbDatabases = rs.getString("nbDatabases");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nbDatabases;
    }

    public String getNbManagement() {
        
        String query = "SELECT COUNT(*) as nbManagement FROM Skill WHERE `id_category` = '5';";

        Statement st = getConnector().getStatement();

        String nbManagement = "0";

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbManagement = rs.getString("nbManagement");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nbManagement;
    }
}

