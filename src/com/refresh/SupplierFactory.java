package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
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
