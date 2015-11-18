package com.refresh;

/**
 * Created by prateeks on 10/4/15.
 */
public class Item {
    private String name;
    private float value;
    private int noOfDayLeft;
    private Supplier supplier;

    public Item(String name, float value, int noOfDayLeft, Supplier supplier, Department department) {
        this.name = name;
        this.value = value;
        this.noOfDayLeft = noOfDayLeft;
        this.supplier = supplier;
        this.department = department;
    }

    private Department department;

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    public int getNoOfDayLeft() {
        return noOfDayLeft;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Department getDepartment() {
        return department;
    }

    public void updatePrice(int normalRate) {
        noOfDayLeft--;
        float newValue = -1;
        if(supplier!=null){
            newValue = supplier.getUpdatedPrice(this, normalRate);
        } else if (department != null){
            newValue = department.getUpdatedPrice(this, normalRate);
        } else {
            newValue = value - normalRate;
        }

        value = newValue > -1 ? newValue : 0;
    }
}
