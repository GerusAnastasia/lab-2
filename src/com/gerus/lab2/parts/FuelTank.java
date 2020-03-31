package com.gerus.lab2.parts;

public class FuelTank extends AbstractPart {

    protected double volume;
    protected double value;

    public FuelTank(double volume) {
        super(volume * 2.5d);
        this.volume = volume;
        this.value = 0d;
    }

    public double getValue() {
        return value;
    }

    public double getVolume() {
        return volume;
    }

    public void putFuel(double amount) {
        if (this.value + amount > volume) {
            System.out.println("Cannot put so much fuel!");
        } else {
            this.value += amount;
            System.out.println("Now " + this.value + " in tank");
        }
    }

    public boolean useFuel(double amount) {
        if (this.value - amount < 0) {
            System.out.println("Not enough fuel!");
            return false;
        } else {
            this.value -= amount;
            System.out.println("Now " + this.value + " in tank");
        }
        return true;
    }
}
