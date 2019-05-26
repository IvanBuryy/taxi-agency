package com.taxiagency.domain;

public class Trip implements Entity {
    private String id;
    private String route;
    Driver driver;
    Car card;
    //Pessenger pessenger;
    private int durarionMins;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId() {

    }
}
