package com.medical;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Commodity,Integer> availableDrugs;

    public Order() {
        availableDrugs = new HashMap<>();
    }

    public void addAvailableDrugs(Commodity drug, Integer quantity){
        this.availableDrugs.put(drug,quantity);
    }

    public float getTotalAmount(){
        return availableDrugs.keySet().stream()
                .reduce(0d,(v,d)-> v + d.getPrice(),(d,e)-> d+e)
                .floatValue();
    }
}