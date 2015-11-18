package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
public class SupplierPriceCalculator implements PriceCalculator {
    @Override
    public float getPriceForNextDay(Item item, int normalRate) {
        return item.getValue()-(normalRate/2);
    }
}
