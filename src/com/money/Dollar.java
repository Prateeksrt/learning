package com.money;

public class Dollar {

    private double value;

    public Dollar(double i) {
        if(i<=0)
            throw new IllegalArgumentException("Value cannot be less than one");
        this.value = i;
    }

    public double getValue() {
        return  value;
    }

    public Dollar add(Dollar dollar) {
        return new Dollar(this.value+dollar.value);
    }

    public Dollar times(int i) {
        return new Dollar(this.value*i);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dollar))return false;
        Dollar dollar = (Dollar)obj;
        return this.value==dollar.value;
    }
}
