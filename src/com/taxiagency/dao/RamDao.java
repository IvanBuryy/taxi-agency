package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.*;

public class RamDao implements Dao {
    private Map<String, Entity> ram;

    public RamDao() {
        this.ram = new HashMap<>();
    }

    @Override
    public String save(Entity obj) {
        ram.put(obj.getId(), obj);
        return null;
    }

    @Override
    public void update(Entity obj) {
        ram.remove(obj.getId());

    }

    @Override
    public String upsert(Entity obj) {
        ram.put(obj.getId(),obj);
       return null;
    }

    @Override
    public void delete(String id) {
        ram.remove(ram.remove(id));

    }

    @Override
    public Entity findById(String id) {
        return ram.get(id);
    }

    @Override
    public List<Entity> findAll() {
        List<Entity> objects = new ArrayList<>();
        Set<String> keys = ram.keySet();

        for (String key : keys) {
            Entity obj = ram.get(key);
            objects.add(obj);
        }

        return objects;
    }

}
