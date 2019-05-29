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
        return "id: " +id + ";" + " name: " + name + ";\n";
    }


    public Driver(String str){
        String[] splitter = str.split(";");

        String idDriver = splitter[0];
        String  id = idDriver.substring(idDriver.indexOf(":")+1).trim();

        String nameDriver = splitter[1];
        String  name = nameDriver.substring(nameDriver.indexOf(":")+1).trim();

        this.id = id;
        this.name = name;}

}
