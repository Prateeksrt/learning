package com.medical.Factory;

import com.medical.Drug;

public class DrugFactory{

    public Drug makeDrug(String name, int price){
        return new Drug(name,price);
    }
}
