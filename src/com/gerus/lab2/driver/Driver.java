package com.gerus.lab2.driver;

import com.gerus.lab2.cars.Car;
import com.gerus.lab2.parts.Wheel;

public class Driver {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver(Car car){
        this.car = car;
    }

    public void manageCar(int index, boolean wantOpen){
        if (index > 4){
            System.out.println("Error door.");
            return;
        }
        if(wantOpen){
            car.getCarCase().setDoorOpened(index);
        }
        else{
            car.getCarCase().setDoorClosed(index);
        }

    }

    public void putWheel(int index){
        if (index > 4){
            System.out.println("Error wheel.");
            return;
        }
        Wheel current = car.getWheels().get(index);
        current.setDeflated();
    }
}
