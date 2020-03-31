package com.gerus.lab2.parts;

public class Engine extends AbstractPart {

    protected boolean isStarted;

    public Engine() {
        super(15d);
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void work() {
        if (isStarted) {
            System.out.println("Engine is working.");
        }
        else {
            start();
            System.out.println("Engine is working.");
        }

    }

    protected void start() {
        isStarted = true;
        System.out.println("Engine started!");
    }

}
