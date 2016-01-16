package com.money;

public class Rupee {


    private double value;

    public Rupee(double i) {
        if(i<=0) throw new IllegalArgumentException("Value cannot be less than one");
        value=i;
    }

    public double getValue() {

        return value;
    }

    public Rupee times(int i) {
        return new Rupee(this.value*i);
    }

    public Rupee add(Rupee rupee) {
        return new Rupee(this.value+rupee.value);
    }
}
