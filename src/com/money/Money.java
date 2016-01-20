package com.money;

public class Money {

    private double value;

    public Money(double i) {
        if(i<=0) throw new IllegalArgumentException("Value cannot be less than one");
        this.value = i;
    }


}
