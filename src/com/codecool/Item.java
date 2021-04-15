package com.codecool;

import java.util.UUID;

public abstract class Item {
    public String name;
    public UUID id;

    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getID(){
        return id;
    }
}
