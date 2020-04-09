package com.gerus.lab2;

import com.gerus.lab2.cars.Car;
import com.gerus.lab2.cars.Tractor;
import com.gerus.lab2.driver.Driver;

public class AllData {
    private Car car;
    private Driver driver;
    private Tractor tractor;

    public Car getCar() {
        return car;
    }

    public Driver getDriver() {
        return driver;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    private AllData(){
    }
    private static AllData instance = null;
    public static AllData getInstance(){
        if(instance == null)
            instance = new AllData();
        return instance;
    }
}
