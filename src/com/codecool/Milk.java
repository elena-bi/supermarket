package com.codecool;

import java.util.Random;

public class Milk extends Item {
    final private int LIMIT_STORAGE_TEMPERATURE = 10;

    public Milk(String name) {
        super(name);
    }

    public boolean isMilkSellable(){
        Random randomTemp = new Random();
        if (randomTemp.nextInt(15) > LIMIT_STORAGE_TEMPERATURE) {
            System.out.println("Limit storage temperature exceeded. Milk gone sour");
            return true;
        } else{
            System.out.println("Milk is ok");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
