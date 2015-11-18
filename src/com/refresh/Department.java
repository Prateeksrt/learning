package com.refresh;

public class Department {
    private String name;
    private PriceCalculator priceCalculator;

    public Department(String name, PriceCalculator priceCalculator) {
        this.name = name;
        this.priceCalculator = priceCalculator;
    }

    public float getUpdatedPrice(Item item, int normalRate) {
        return priceCalculator.getPriceForNextDay(item,normalRate);
    }
}
