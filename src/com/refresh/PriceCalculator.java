package com.refresh;

public interface PriceCalculator {
    float getPriceForNextDay(Item item, int normalRate);
}
