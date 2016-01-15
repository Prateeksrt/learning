package com.medical;

import com.medical.Factory.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Drug> drugs = new ArrayList<>();

        DrugFactory drugFactory = new DrugFactory();

        Drug crocin = drugFactory.makeDrug("Crocin", 10);
        Drug nise = drugFactory.makeDrug("Nise", 8);
        Drug vicks = drugFactory.makeDrug("Vicks", 3);

        drugs.add(crocin);
        drugs.add(crocin);
        drugs.add(crocin);
        drugs.add(crocin);
        drugs.add(nise);
        drugs.add(nise);
        drugs.add(nise);
        drugs.add(nise);
        drugs.add(vicks);
        drugs.add(vicks);
        drugs.add(vicks);
        drugs.add(vicks);

        InventoryFactory inventoryFactory = new InventoryFactory();
        Inventory drugInventor = inventoryFactory.makeInventory(drugs);

        StoreFactory storeFactory = new StoreFactory();
        Store store = storeFactory.makeStore("default", drugInventor);

        UserFactory userFactory = new UserFactory();
        User prateek = userFactory.makeUser("Prateek");

        PrescriptionFactory prescriptionFactory = new PrescriptionFactory();
        Prescription prescription = prescriptionFactory.makePrescription();

        drugs.forEach(d->prescription.addDrug(d,1));

        System.out.println(prateek.bookDrug(prescription,store));

    }
}