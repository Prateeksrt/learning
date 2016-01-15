package com.medical;

public class DefaultInvoiceGenerator implements InvoiceGenerator {

    private final float taxRate;

    public DefaultInvoiceGenerator() {
        this.taxRate = 0;
    }

    @Override
    public Invoice generateInvoice(Order order) {
        Invoice invoice = new Invoice();
        float total = order.getTotalAmount();
        invoice.setTotalBeforeTax(total);
        invoice.setTax((long) (total*taxRate));
        return invoice;
    }
}
