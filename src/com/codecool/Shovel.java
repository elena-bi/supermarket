package com.codecool;

import java.util.Random;

public class Shovel extends Item {
    private Material material;
    private Size size;
    public static int noOfShovels;

    public Shovel(String name) {
        super(name);
    }

    public boolean isStolen() {
        Random randomNumber = new Random();
        if (material == Material.CHOCOLATE) {
            if(size.equals(Size.BIG)) {
                return randomNumber.nextInt(100) < 60;
            } else if (size.equals(Size.NORMAL)) {
                return randomNumber.nextInt(100) < 40;
            } else if (size.equals(Size.SMALL)) {
                return randomNumber.nextInt(100) < 20;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        return "Shovel{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", material=" + material +
                ", size=" + size +
                '}';
    }
}
