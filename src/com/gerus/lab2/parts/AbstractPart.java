package com.gerus.lab2.parts;

public class AbstractPart {

    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public AbstractPart(double weight) {
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}
