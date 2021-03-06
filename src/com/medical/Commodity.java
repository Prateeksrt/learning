package com.medical;

public abstract class Commodity {

    private String name;

    private float price;

    public Commodity(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
