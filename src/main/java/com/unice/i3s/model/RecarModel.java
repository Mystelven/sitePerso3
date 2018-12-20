package com.unice.i3s.model;

/**
 * Created by mystelven on 01/03/2015.
 */
public class RecarModel extends TableModel {

    private static final long serialVersionUID = 0x2c546d89L;

    private static RecarModel INSTANCE = new RecarModel();

    /* The class ResearchModel is a Singleton, we don't need multi-instance to perform requests */
    public static RecarModel getRecarModel() { return INSTANCE; }

    private RecarModel() {

        log().info("RecarModel() -- IN");

        log().info("RecarModel() -- OUT");
    }

}
