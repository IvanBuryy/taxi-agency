package com.taxiagency;
//package com.taxiagency.domain.Driver;


import com.taxiagency.domain.Driver;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class MainFileDriver {
    public static void main(String[] args) {
        File driverFile = new File("driverFile.txt");
        try {
            if (!driverFile.exists()) {
                driverFile.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        Driver driver = new Driver("1", "Ivan");
        Driver driver1 = new Driver("2", "Ilya");
        Driver driver2 = new Driver("3", "Borya");
        Driver driver3 = new Driver("4", "Igor");

        try(
                FileWriter fw = new FileWriter(driverFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fw);
        ){
            bufferedWriter.write(driver.toString());
            bufferedWriter.write(driver1.toString());
            bufferedWriter.write(driver2.toString());
            bufferedWriter.write(driver3.toString());
        }catch (IOException e){e.printStackTrace();}

        Driver driverFromFile = null;

        try (
                FileReader fileReader = new FileReader(driverFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            String line =  bufferedReader.readLine();
            driverFromFile = new Driver(line);
        }catch (IOException e){e.printStackTrace();}
        System.out.println("driver: " + driverFromFile);
    }
}
