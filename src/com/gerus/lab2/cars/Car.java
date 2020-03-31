package com.gerus.lab2.cars;
import com.gerus.lab2.parts.*;

import java.util.ArrayList;

public class Car {

    public String name;

    public ArrayList<AbstractPart> parts;

    public Case carCase;
    public Engine engine;
    public FuelTank tank;
    public ArrayList<Wheel> wheels;

    public Car(String name, int doors, double fuelVolume) {
        this.name = name;
        this.parts = new ArrayList<>();

        this.carCase = new Case(doors);
        this.addPart(carCase);

        this.engine = new Engine();
        this.addPart(engine);

        this.tank = new FuelTank(fuelVolume);
        this.addPart(tank);

        this.wheels = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            this.addPart(wheel);
            this.wheels.add(wheel);
        }
    }

    protected void addPart(AbstractPart part) {
        this.parts.add(part);
    }

    public void start(double amount) {
    if(tank.getValue() == 0d){
        tank.putFuel(amount);
    }
        this.engine.work();
        System.out.println("Car started.");


    }

    public void drive() {
        double amount = tank.getVolume() - 1;
        start(amount);
        System.out.println("Car is going.");


    }

}