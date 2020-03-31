package com.gerus.lab2.parts;


import java.util.HashMap;
import java.util.Map;

public class Case extends AbstractPart {

    protected int doors = 4;
    protected Map<Integer, Boolean> opened;

    public Case(int doors) {
        super(20d + 5d * doors);
        this.doors = doors;
        this.opened = new HashMap<>();
    }

    public int getDoors() {
        return doors;
    }

    public boolean isDoorOpened(int index) {
        if (index >= doors) throw new IndexOutOfBoundsException("Only " + this.doors + " doors");
        if (!opened.containsKey(index))
            opened.put(index, false);
        return opened.get(index);
    }

    public void setDoorOpened(int index) {
        System.out.println("Door " + index + " opened");
        opened.put(index, true);
    }

    public void setDoorClosed(int index) {
        System.out.println("Door " + index + " closed");
        opened.put(index, false);
    }

}
