package com.unice.i3s.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mystelven on 01/03/2015.
 */
public class ResearchModel extends TableModel {

    private static final long serialVersionUID = 0x2c546d89L;

    private static ResearchModel INSTANCE = new ResearchModel();

    /* The class ResearchModel is a Singleton, we don't need multi-instance to perform requests */
    public static ResearchModel getResearchModel() { return INSTANCE; }

    private ResearchModel() {

        log().info("ResearchModel() -- IN");

        log().info("ResearchModel() -- OUT");
    }

}
