package com.polytech.mystelven.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 03/03/2015.
 */
public class ScientificProductionModel extends TableModel {

    private static final long serialVersionUID = 0x2543c46d87L;

    private static ScientificProductionModel INSTANCE = new ScientificProductionModel();

    /* The class ExperienceModel is a Singleton, we don't need multi-instance to perform requests */
    public static ScientificProductionModel getProjectModel() { return INSTANCE; }

    private ArrayList<String> descriptions;

    private ArrayList<String> images;

    private ArrayList<String> names;

    private ArrayList<String> datesProject;

    private ArrayList<String> categories;

    private ScientificProductionModel() {
        
        log().info("ProjectModel() -- IN");

        log().info("ProjectModel() -- OUT");
        
    }

    public String getNbProject() {

        String query = "SELECT COUNT(*) as nbProject FROM ResearchSoftware";
        String nbProject = "0";
        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {
                nbProject = rs.getString("nbProject");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            getConnector().close();
        }
        
        return nbProject;
    }

    public ArrayList<String> getNames() {

        log().info("getNames() -- IN");

        if(names == null) {
            this.getAll();
        }

        log().info("getNames() -- OUT");
        
        return names;
    }
    
    public ArrayList<String> getDescriptions() {

        log().info("getDescriptions() -- IN");

        if(descriptions == null) {
            this.getAll();
        }

        log().info("getDescriptions() -- OUT");

        return descriptions;
    }

    public ArrayList<String> getDateProject() {

        log().info("getDateProject() -- IN");

        if(datesProject == null) {
            this.getAll();
        }

        log().info("getDateProject() -- OUT");

        return datesProject;
    }

    public ArrayList<String> getCategory() {

        log().info("getCategories() -- IN");

        if(categories == null) {
            this.getAll();
        }

        log().info("getCategories() -- OUT");

        return categories;
    }

    public void getAll() {

        names                   = new ArrayList<String>();
        descriptions            = new ArrayList<String>();
        images                  = new ArrayList<String>();
        datesProject            = new ArrayList<String>();
        categories              = new ArrayList<String>();

        String query = "SELECT `name_project`,`description_project`,`image_project`, `date_project`,`titre` FROM ResearchSoftware JOIN CategoryProject on CategoryProject.id = ResearchSoftware.id_category order by date_project desc";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;
        try {
            rs = st.executeQuery(query);
            while (rs.next()) {

                names.add(rs.getString("name_project"));
                descriptions.add(rs.getString("description_project"));
                images.add(rs.getString("image_project"));
                datesProject.add(rs.getString("date_project"));
                categories.add(rs.getString("titre"));

            }
        } catch (SQLException e) {

            log().error(e.getMessage());

        } finally {

            getConnector().close();
        }

    }

    public ArrayList<String> getImages() {

        log().info("getImages() -- IN");

        if(images == null) {
            this.getAll();
        }

        log().info("getImages() -- OUT");

        return images;
    }

    public ArrayList<String> getId() {

        log().info("getId() -- IN");

        ArrayList<String> ids = new ArrayList<String>();

        String query = "SELECT `id_project` FROM ResearchSoftware order by date_project desc";

        Statement st = getConnector().getStatement();

        ResultSet rs = null;

        try {

            rs = st.executeQuery(query);

            while (rs.next()) {

                ids.add(rs.getString("id_project"));

            }
        } catch (SQLException e) {
            log().error(e.getMessage());
        }

        log().info("getId() -- OUT");

        return ids;
    }
}
