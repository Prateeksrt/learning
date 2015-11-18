package com.refresh;

public class CheeseDeptPriceCalculator implements PriceCalculator{

    @Override
    public float getPriceForNextDay(Item item, int normalRate){
        if(item.getNoOfDayLeft()<=0)
            return 0;
        else {
            return item.getValue()+normalRate;
        }
    }
}
