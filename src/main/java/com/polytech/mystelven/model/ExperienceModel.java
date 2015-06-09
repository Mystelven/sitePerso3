package com.polytech.mystelven.model;

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
        
        String query = "";
        
        if(!personal)
            query = "SELECT `city_experience` FROM Experience  where personal = 0 order by `order_experience` desc ";
        else
            query = "SELECT `city_experience` FROM Experience  where personal = 1 order by `order_experience` desc ";
        
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {

            rs = st.executeQuery(query);
            if(personal)
                log().info("getNames() -- Request for personal names performed.");
            else
                log().info("getNames() -- Request for non personal names performed.");
            
            while (rs.next()) {

                names.add(rs.getString("city_experience"));
            }
            
        } catch (SQLException e) {
            log().error("\tgetNames() -- SQLException "+e.getMessage());
        }

        log().info("getNames() -- OUT");
        
        return names;
    }

    public ArrayList<String> getDescriptions(boolean personal) {

        log().info("getDescriptions() -- IN");

        ArrayList<String> descriptions = new ArrayList<String>();
        String query = "";
        
        if(!personal)
            query = "SELECT `description_experience` FROM Experience  where personal = 0 order by `order_experience` desc ";
        else
            query = "SELECT `description_experience` FROM Experience  where personal = 1 order by `order_experience` desc ";
        
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        
        try {

            rs = st.executeQuery(query);
            if(personal)
                log().info("getDescriptions() -- Request for personal descriptions performed.");
            else
                log().info("getDescriptions() -- Request for non personal descriptions performed.");

            while (rs.next()) {

                descriptions.add(rs.getString("description_experience"));
            }
        } catch (SQLException e) {
            
            log().error("getDescriptions() -- SQLException "+e.getMessage());

        }

        log().info("getDescriptions() -- OUT");
        
        return descriptions;
    }

    public ArrayList<String> getDates(boolean personal) {

        log().info("getDates() -- IN");

        ArrayList<String> dates = new ArrayList<String>();
        String query = "";
        
        if(!personal)
            query = "SELECT CONCAT(CONCAT(`debut_experience`,\" - \"),`fin_experience`) as dates FROM Experience  where personal = 0 order by `order_experience` desc";
        else
            query = "SELECT CONCAT(CONCAT(`debut_experience`,\" - \"),`fin_experience`) as dates FROM Experience  where personal = 1 order by `order_experience` desc";
        
        
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);

            if(personal)
                log().info("getDates() -- Request for personal dates performed.");
            else
                log().info("getDates() -- Request for non personal dates performed.");
            
            while (rs.next()) {

                dates.add(rs.getString("dates"));
            }
        } catch (SQLException e) {
            
            log().error("getDates() -- SQLException " + e.getMessage());
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
        
        String query = "";
        
        if(!personal)
            query = "SELECT COUNT(*) as nbExp FROM Experience where personal = 0";
        else
            query = "SELECT COUNT(*) as nbExp FROM Experience where personal = 1";
        
        String nbExp = "0";
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            
            rs = st.executeQuery(query);
            
            if(personal)
                log().info("getNbExperiences() -- Request for the number of personal experience performed.");
            else
                log().info("getNbExperiences() -- Request for the number of non personal experience performed.");
            
            while (rs.next()) {
                
                nbExp = rs.getString("nbExp");
            }
            
        } catch (SQLException e) {

            log().error("getNbExperiences() -- SQLException " + e.getMessage());
        }

        log().info("getNbExperiences() -- OUT");
        
        return nbExp;
    }


}
