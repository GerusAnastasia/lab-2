package com.gerus.lab2;

import com.gerus.lab2.cars.Car;
import com.gerus.lab2.cars.Tractor;
import com.gerus.lab2.driver.Driver;

public class AllData {
    public Car car;
    public Driver driver;
    public Tractor tractor;

    private AllData(){
    }
    private static AllData instance = null;
    public static AllData getInstance(){
        if(instance == null)
            instance = new AllData();
        return instance;
    }
}
