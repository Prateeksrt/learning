package com.medical;

import java.util.Date;

public class Invoice {
    private final Date date;
    private float totalBeforeTax;
    private float tax;

    public void setTotalBeforeTax(float totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public Invoice() {
        this.date = new Date();
    }

    @Override
    public String toString() {
        return ("Bill \n") +
                "Date: " + date.toString() + "\n" +
                "Total: " + totalBeforeTax + "\n" +
                "Tax: " + tax + "\n" +
                "Grand Total: " + (totalBeforeTax + tax) + "\n";
    }
}
