package com.gerus.lab2.driver;

import com.gerus.lab2.cars.Car;
import com.gerus.lab2.parts.Wheel;

public class Driver {
    private Car car;

    public Driver(Car car){
        this.car = car;
    }

    public void manageCar(int index, boolean wantOpen){
        if (index > 4){
            System.out.println("Error door.");
            return;
        }
        if(wantOpen){
            car.carCase.setDoorOpened(index);
        }
        else{
            car.carCase.setDoorClosed(index);
        }

    }

    public void putWheel(int index){
        if (index > 4){
            System.out.println("Error wheel.");
            return;
        }
        Wheel current = car.wheels.get(index);
        current.setDeflated();
    }
}
