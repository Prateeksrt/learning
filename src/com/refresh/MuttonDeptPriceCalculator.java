package com.refresh;

public class MuttonDeptPriceCalculator implements PriceCalculator {
    @Override
    public float getPriceForNextDay(Item item, int normalRate) {

        return item.getValue()+normalRate*3;
    }
}
