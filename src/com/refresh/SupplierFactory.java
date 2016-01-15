package com.refresh;

public class SupplierFactory {

    private Supplier getSuperSupplier(){
        return new Supplier("Super", SupplierPriceCalculator.getInstance());
    }

    public Supplier getInstance(String supplierName){
        switch(supplierName){
            case "SUPER":
                return getSuperSupplier();
            default:
                return null;
        }
    }
}
