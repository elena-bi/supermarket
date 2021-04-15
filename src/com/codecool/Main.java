package com.codecool;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shovel shovel = new Shovel("shovel");
//        shovel.isStolen(Material.CHOCOLATE);
        Milk milk = new Milk("milk");
        milk.isMilkSellable();

        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(shovel);

    }
}
