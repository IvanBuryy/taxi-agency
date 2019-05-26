package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.List;

public class JdbcDao implements Dao {
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
        return null;
    }
}
