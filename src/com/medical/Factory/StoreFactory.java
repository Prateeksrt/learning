package com.medical.Factory;

import com.medical.DefaultInvoiceGenerator;
import com.medical.Inventory;
import com.medical.InvoiceGenerator;
import com.medical.Store;

public class StoreFactory {

    public Store makeStore(String type, Inventory inventory){
        InvoiceGenerator invoiceGenerator = null;
        switch(type.toLowerCase()){
            default:
                return getStoreWithDefaultInvoiceGenerator(inventory);
        }
    }

    private Store getStoreWithDefaultInvoiceGenerator(Inventory inventory){
        return new Store(inventory, new DefaultInvoiceGenerator());
    }
}
