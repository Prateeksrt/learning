package com.refresh;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prateeks on 10/4/15.
 */
public class Store {
    private List<Item> items;
    private int normalRate;

    public Store() {
        this.items = new ArrayList<>();
        this.normalRate = 10;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void updatPrices() {
        for(Item item : items){
            item.updatePrice(normalRate);
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
