package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.List;

public interface TripDao extends Dao {
    @Override
    String save(Entity obj);

    @Override
    void update(Entity obj);

    @Override
    String upsert(Entity obj);

    @Override
    void delete(String id);

    @Override
    Entity findById(String id);

    @Override
    List findAll();
}
