package com.taxiagency.dao;
import java.util.*;

import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

public class DriveRamDao <T extends RamDao> implements DriveDao<T> {

    @Override
    public List<Driver> findByName() {
        return null;
    }

    @Override
    public String save(Entity obj) {
        return null;
    }

    @Override
    public void update(Entity obj) {

    }

    @Override
    public String upsert(Entity obj) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Entity findById(String id) {
        return null;
    }

    @Override
    public List findAll() {
        List<String> arrListDriver = new ArrayList<>();
        return arrListDriver;
    }

}

