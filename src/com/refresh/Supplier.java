package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
public class Supplier {
    private String name;
    private PriceCalculator priceCalculator;

    public Supplier(String name, PriceCalculator priceCalculator) {
        this.name = name;
        this.priceCalculator = priceCalculator;
    }

    public float getUpdatedPrice(Item item, int normalRate){
        return priceCalculator.getPriceForNextDay(item, normalRate);
    }
}
