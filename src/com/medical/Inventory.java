package com.medical;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<? extends InventoryItem> inventoryItems;

    public int getQuantity(InventoryItem inventoryItem) {
        return ((int) inventoryItems.stream().filter(d -> d.equals(inventoryItem)).count());
    }

    public List<InventoryItem> getItems(InventoryItem inventoryItem, long quantity) throws Exception {
        if(getQuantity(inventoryItem)>=quantity){
            List<InventoryItem> items = new ArrayList<>();
            for(int i =1;i<=quantity;i++){
                inventoryItems.remove(inventoryItem);
                items.add(inventoryItem);
            }
            return items;
        }
        throw new Exception(inventoryItem.getName()+" "+getQuantity(inventoryItem)
                +" units are left and you ask "+quantity+" units");
    }

    public Inventory(List<? extends InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
}