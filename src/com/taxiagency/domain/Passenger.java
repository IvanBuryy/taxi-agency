package com.taxiagency.domain;

public class Passenger implements Entity{
    private String id;
    private String name;
    private String mobilePhone;

    public Passenger(String id, String name, String mobilePhone) {
        this.id = id;
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId() {

    }
}
