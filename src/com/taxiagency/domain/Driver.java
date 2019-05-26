package com.taxiagency.domain;

public class Driver implements Entity {
    private String id;
    private String name;

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId() { }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
