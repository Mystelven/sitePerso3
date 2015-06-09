package com.polytech.mystelven.model;

import org.apache.log4j.Logger;

import java.io.Serializable;

/**
 * Created by mystelven on 03/03/2015.
 */
public abstract class TableModel implements Serializable {

    private static final long serialVersionUID = 0x2c546d87L;

    private MysqlConnector connector;

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    public TableModel() {
        
        log().info("TableModel() -- IN");
        
        connector = MysqlConnector.getMySQLConnector();

        log().info("TableModel() -- OUT");
    }
    
    public MysqlConnector getConnector() {
        
        return connector;
    }


}
