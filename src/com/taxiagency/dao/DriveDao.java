package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.util.ArrayList;
import java.util.List;

public interface DriveDao<T extends RamDao> extends Dao {
    List<Driver> findByName ();
}
