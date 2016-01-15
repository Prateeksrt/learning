package com.medical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prescription {


    private Map<Drug,Integer> prescriptionItems;

    public Prescription() {
        this.prescriptionItems = new HashMap<>();
    }

    public void addDrug(Drug drug, int quantity){
        this.prescriptionItems.put(drug,quantity);
    }

    public Set<Drug> getDrugs(){
        return prescriptionItems.keySet();
    }

    public int getQuantityForDrug(Drug drug){
        return prescriptionItems.get(drug);
    }
}
