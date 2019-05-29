package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Color;
import com.taxiagency.domain.Entity;

import java.util.List;

public interface CarDao extends Dao {
   Car findByNumber();
   List<Car> finndByColor();

    @Override
    default String save(Entity obj) {
        return null;
    }

    @Override
    default void update(Entity obj) {

    }

    @Override
    default String upsert(Entity obj) {
        return null;
    }

    @Override
    default void delete(String id) {

    }

    @Override
    default Entity findById(String id) {
        return null;
    }

    @Override
    default List findAll() {
        return null;
    }
}