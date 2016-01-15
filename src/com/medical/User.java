package com.medical;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public Invoice bookDrug(Prescription prescription, Store store){
        return store.bookOrder(prescription);
    }

    public String getName() {
        return name;
    }
}
