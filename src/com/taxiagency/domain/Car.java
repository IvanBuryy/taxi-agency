package com.taxiagency.domain;

public  class Car implements Entity{
    private String id;
    private String name;

    Color color;

    public Car(String id, String name, Color color) {
        this.name = name;
        this.id = id;
        this.color=color;
    }

    public String getName() {
        return name;
    }
    public String getId() {return id;}

    @Override
    public void setId() {

    }

    public Color getColor() {
        return color;}

    @Override
    public String toString() {
        return "id= " + id + ";" + " name: " + name +";" + " color: " + color;
    }
}
