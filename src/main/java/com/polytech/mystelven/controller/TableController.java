package com.polytech.mystelven.controller;

import com.polytech.mystelven.model.TableModel;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by mystelven on 03/03/2015.
 */
public abstract class TableController implements Serializable {

    private static final long serialVersionUID = 0x2394348930483984L;
    
    protected TableModel tableModel;

    protected Logger log() { return Logger.getLogger(this.getClass().getSimpleName()); }
    
    public TableController() {

        log().info("TableController() -- IN");

        log().info("TableController() -- OUT");
    }
}
