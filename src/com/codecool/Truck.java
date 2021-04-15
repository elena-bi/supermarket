package com.codecool;

import java.util.Random;

public class Truck extends Item {
    private int noOfWheels;
    private boolean fashionableNumber;

    public Truck(String name) {
        super(name);
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public boolean isFashionableNumber() {
        Random randomizer = new Random();
        return randomizer.nextBoolean();
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", noOfWheels=" + noOfWheels +
                ", fashionableNumber=" + fashionableNumber +
                '}';
    }
}
