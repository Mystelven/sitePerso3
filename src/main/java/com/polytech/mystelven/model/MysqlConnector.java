package com.polytech.mystelven.model;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by mystelven on 01/03/2015.
 * This class represents the access to the MySQL database
 */
public class MysqlConnector implements Serializable {

    /** Represent the unique SerialVersionUID */
    private static final long serialVersionUID = 0x3d6d87L;

    /** The URL of the MySQL database that we will access by JDBC. */
    private  String url = "jdbc:mysql://localhost/sitepersojava";
    // jdbc:mysql://173.194.243.19:3306?user=root

    /** The login for the Database. */
    private  String login = "root";

    /** The password for the Database.  */
    private  String password = "root";

    /** We will need a Statement to perform request on the Database*/
    private  Statement st = null;

    private static MysqlConnector INSTANCE = new MysqlConnector();

    /**
     * this function we give us a Logger with the name of the class that call this method.
     * @return a Logger with the good name. 
     */
    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }

    /**
     * The class MySQLConnector is a Singleton, we don't need multi-entrance with the database
     * @return the only possible instance of MysqlConnector
     */
    public static MysqlConnector getMySQLConnector() { 
        
        return INSTANCE;
    }

    /**
     * Like MysqlConnector() is a Singleton then the constructor is private;
     */
    private MysqlConnector() {
        
        log().info("MysqlConnector() -- IN");
        
        try {
            
            log().info("\tMysqlConnector() -- Connection starting...");
            
            /* We perform the connection to the database. */
            Connection cn = DriverManager.getConnection(url,login,password);
            
            log().info("\tMysqlConnector() -- Connection established");
            
            /* We create a Statement object to perform request later. */
            st = cn.createStatement();
            
        } catch (Exception e) {
            
            log().error("\tMysqlConnector() -- Problem in the connection with the database");
            log().error("\tMysqlConnector() -- URL      : "+url);
            log().error("\tMysqlConnector() -- "+e.getMessage());
            System.exit(0);
        }

        log().info("MysqlConnector() -- OUT");
    }

    /**
     * We need to be able to get a Statement object to perform request.
     * @return a Statement object to perform request on the Database
     */
    public Statement getStatement() {
        
        return INSTANCE.st;
    }
}
