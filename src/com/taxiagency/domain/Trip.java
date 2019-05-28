package com.taxiagency.domain;

public class Trip implements Entity {
    private String id;
    private String route;
    Driver driver;
    Car card;
    Passenger pessenger;
    private int durarionMins;

    public Trip(String id, String route, Driver driver, Car card, Passenger pessenger, int durarionMins) {
        this.id = id;
        this.route = route;
        this.driver = driver;
        this.card = card;
        this.pessenger = pessenger;
        this.durarionMins = durarionMins;
    }

    public String getRoute() {
        return route;
    }

    public Driver getDriver() {
        return driver;
    }

    public Car getCard() {
        return card;
    }

    public Passenger getPessenger() {
        return pessenger;
    }

    public int getDurarionMins() {
        return durarionMins;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId() {

    }
}
