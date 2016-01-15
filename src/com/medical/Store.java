package com.medical;

public class Store {

    private Inventory inventory;

    private InvoiceGenerator invoiceGenerator;

    public Store(Inventory inventory, InvoiceGenerator invoiceGenerator) {
        this.inventory = inventory;
        this.invoiceGenerator = invoiceGenerator;
    }

    public Invoice bookOrder(Prescription prescription){
        Order bookedOrder = createOrder(prescription);
        return invoiceGenerator.generateInvoice(bookedOrder);
    }

    private Order createOrder(Prescription prescription) {
        Order availableOrder = new Order();
        prescription.getDrugs().forEach(drug->
                getRequiredDrug(availableOrder, drug, prescription.getQuantityForDrug(drug)));
        return availableOrder;
    }

    private void getRequiredDrug(Order availableOrder, Drug requiredDrug, int requiredQuantity) {

        int quantityInInventory = inventory.getQuantity(requiredDrug);
        int quantity = getAvailableQuantity(requiredQuantity, quantityInInventory);
        try {
            inventory.getItems(requiredDrug,quantity);
        } catch (Exception e) {
            return;
        }
        if(quantity>0){
            availableOrder.addAvailableDrugs(requiredDrug,quantity);
        }
    }

    private int getAvailableQuantity(int requiredQuantity, int quantityInInventory) {
        return quantityInInventory >= requiredQuantity ? requiredQuantity : quantityInInventory;
    }
}