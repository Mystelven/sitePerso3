package com.unice.i3s.model;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by mystelven on 01/03/2015.
 * This class represents the access to the MySQL database
 */
public class MysqlConnector implements Serializable {

    /** Represent the unique SerialVersionUID */
    private static final long serialVersionUID = 0x3d6d87L;

    private static String url = null;

    /** The login for the Database. */
    private static String login = null;

    /** The password for the Database.  */
    private static String password = null;

    private static Connection cn = null;

    private static boolean localhost = true;

    /** The URL of the MySQL database that we will access by JDBC. */
    static {

        if(localhost) {

            url = "jdbc:mysql://localhost:3306/sitepersojava";
            login = "root";
            password = "root";

        }

    }

    static{ // would have to be surrounded by try catch
        
        try {

            Class.forName("com.mysql.jdbc.Driver");   // this will load the class Driver

        } catch (ClassNotFoundException e) {
            
            Logger.getLogger(MysqlConnector.class).error(e.getMessage());
        }
    }

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

        if(INSTANCE == null) {
            INSTANCE = new MysqlConnector();
        }

        return INSTANCE;
    }

    public void close() {

    }

    /**
     * Like MysqlConnector() is a Singleton then the constructor is private;
     */
    private MysqlConnector() {
        
        log().info("MysqlConnector() -- IN");


        log().info("MysqlConnector() -- OUT");
    }

    /**
     * We need to be able to get a Statement object to perform request.
     * @return a Statement object to perform request on the Database
     */
    public Statement getStatement() {

        try {


            /* We perform the connection to the database. */
            if(INSTANCE.cn != null && INSTANCE.cn.isClosed() || INSTANCE.cn ==null) {
                log().info("\tMysqlConnector() -- Connection starting...");
                // INSTANCE.cn = DriverManager.getConnection(url, login, password);
                log().info("\tMysqlConnector() -- Connection established");
            }

            return null; // getMySQLConnector().cn.createStatement();

        } catch (SQLException e) {

            log().error("\tMysqlConnector() -- Problem in the connection with the database");
            log().error("\tMysqlConnector() -- URL      : "+url);
            log().error("\tMysqlConnector() -- "+e.getMessage());
        }

        return null;
    }
}
