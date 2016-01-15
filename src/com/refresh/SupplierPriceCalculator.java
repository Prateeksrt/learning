package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
public class SupplierPriceCalculator implements PriceCalculator {

    private static SupplierPriceCalculator priceCalculator;

    public static PriceCalculator getInstance(){
        if(priceCalculator!=null) return priceCalculator;
        priceCalculator = new SupplierPriceCalculator();
        return priceCalculator;
    }

    @Override
    public float getPriceForNextDay(Item item, int normalRate) {
        return item.getValue()-(normalRate/2);
    }
}
