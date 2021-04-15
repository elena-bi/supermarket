package com.codecool;

import java.util.*;

public class Supermarket {
    public Map<String, Integer> markedItems;
    public Map<Item, Integer> products;
    public List<Item> collectedBoxes;

    public Supermarket() {
        this.products = new HashMap<>();
        this.markedItems = new HashMap<>();
    }

    public void addProduct(Item item){
        int count = products.getOrDefault(item, 0);
        products.put(item, count + 1);
    }

    public void getReport(){
//        for (Item item : products.values()) {
//            if (item instanceof Milk && ((Milk) item).isMilkSellable()) {
//                products.put(item.getID(), item);
//            } else if ( item instanceof Milk && !(((Milk) item).isMilkSellable())) {
//                collectedBoxes.add(item);
//            }
//        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Report of sellable items: \n");
        for (Item item : products.keySet()) {
            if (products.get(item) > 0) {
                stringBuilder.append(item.toString())
                        .append("  ")
                        .append(products.get(item))
                        .append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public Truck getTruckWithFashionableNumbers(Item item){
        for (Item product : products.keySet()) {
            if (product instanceof Truck && ((Truck) product).isFashionableNumber()){
                int count = products.get(product);
                if (count > 0){
                    products.put(product, count-1);
                    return (Truck) product;
                } else {
                    System.out.println(product.getName() + " is not sellable");
                    return null;
                }
            }
        }
        return null;
    }

    public void passOneTurn(){
        for (Item product : products.keySet()) {
            if (product instanceof Shovel && ((Shovel) product).isStolen() && products.get(product) > 0) {
                String stolenShovel = "Number of shovels stolen: ";
                int count = markedItems.getOrDefault(stolenShovel, 0);
                markedItems.put(stolenShovel, count+1);
                products.put(product, products.get(product) - 1);
            } else if (product instanceof Milk && ((Milk) product).isMilkSellable()) {
                String spoiledMilk = "Number of boxes of milk gone spoiled: ";
                int count = markedItems.getOrDefault(spoiledMilk, 0);
                markedItems.put(spoiledMilk, count + 1);
                products.put(product, products.get(product) - 1);
            } else if (product instanceof Truck && ((Truck) product).isFashionableNumber()){
                String notFashionable = "Number of truck with unfashionable wheels: ";
                int count = markedItems.getOrDefault(notFashionable, 0);
                markedItems.put(notFashionable, count + 1);
                products.put(product, products.get(product) - 1);
            }
        }
        getReport();
        System.out.println("Unsellable items: \n");
        for (String s : markedItems.keySet()) {
            System.out.println(s + markedItems.get(s));
        }
    }

}
