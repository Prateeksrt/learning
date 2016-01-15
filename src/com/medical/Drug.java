package com.medical;

public class Drug extends Commodity implements InventoryItem{

    public Drug(String name, float price) {
        super(name, price);
    }
}