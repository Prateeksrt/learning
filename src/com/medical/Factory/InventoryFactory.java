package com.medical.Factory;

import com.medical.Inventory;
import com.medical.InventoryItem;

import java.util.List;

public class InventoryFactory {

    public Inventory makeInventory(List<? extends InventoryItem> items){
        return new Inventory(items);
    }
}
