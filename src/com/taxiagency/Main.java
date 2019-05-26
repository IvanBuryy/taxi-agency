package com.taxiagency;

import com.taxiagency.dao.Dao;
import com.taxiagency.dao.DriveRamDao;
import com.taxiagency.domain.Driver;
import com.taxiagency.domain.Entity;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Dao<Driver> driveRamDao = new DriveRamDao<>();
        for (int i = 0; i < 2; i++) {
            String id = String.valueOf(i + 1);
            String name = "Ivan";
            Driver driver = new Driver(id, name);
            driveRamDao.save(driver);
            List<Driver> driverList = ((DriveRamDao) driveRamDao).findByName();
            System.out.println(driver);
        }
    }
}
