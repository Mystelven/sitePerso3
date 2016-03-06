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

        String query = "SELECT COUNT(*) as nbEduc FROM Education";
        String nbEduc = "0";
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbEduc = rs.getString("nbEduc");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nbEduc;
    }

    public ArrayList<String> getNames() {
        
        ArrayList<String> names = new ArrayList<String>();

        String query = "SELECT `name_education` FROM Education order by debut DESC,fin DESC";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {

                names.add(rs.getString("name_education"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return names;
    }

    public ArrayList<String> getDescriptions() {

        ArrayList<String> descriptions = new ArrayList<String>();

        String query = "SELECT `description_education` FROM Education order by debut DESC,fin DESC";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {

                descriptions.add(rs.getString("description_education"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return descriptions;
    }

    public ArrayList<String> getDates() {

        ArrayList<String> dates = new ArrayList<String>();

        String query = "SELECT CONCAT(CONCAT(`debut`,\" - \"),`fin`) as dates FROM Education order by debut DESC,fin DESC";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {

                dates.add(rs.getString("dates"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dates;
    }

    public ArrayList<String> getLogo() {

        ArrayList<String> logos = new ArrayList<String>();

        String query = "SELECT logo_name FROM Education NATURAL JOIN Logo order by debut DESC,fin DESC";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {

                logos.add(rs.getString("logo_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return logos;
    }

    public ArrayList<String> getCurrent() {

        log().info("getCurrent() -- IN");

        ArrayList<String> current = new ArrayList<String>();
        String query = "";

        query = "SELECT `fin` FROM Education order by debut DESC,fin DESC";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        try {

            rs = st.executeQuery(query);

            while (rs.next()) {

                if(rs.getString("fin").compareTo(String.valueOf(cal.get(Calendar.YEAR))) > 0) {
                    current.add("true");
                } else {
                    current.add("false");
                }
            }
        } catch (SQLException e) {

            log().error("getCurrent() -- SQLException "+e.getMessage());

        }

        log().info("getCurrent() -- OUT");

        return current;
    }

}
