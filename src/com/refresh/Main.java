package com.refresh;

import java.util.Scanner;

/**
 * Created by prateeks on 10/4/15.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        getItemsForStore(store);
        System.out.println("Enter the day after which you want the price list");
        int numberOfDay = Integer.parseInt(sc.nextLine());
        updatePrice(numberOfDay,store);
        printPriceList(store);
    }

    private static void printPriceList(Store store) {
        System.out.println("Name\t\tValue");
        for(Item item : store.getItems()){
            System.out.println(item.getName()+"\t\t"+item.getValue());
        }
    }

    private static void getItemsForStore(Store store) {
        SupplierFactory supplierFactory = new SupplierFactory();
        DepartmentFactory departmentFactory = new DepartmentFactory();
        boolean exit = false;
        do {
            System.out.println("Enter the name of the item");
            String name = sc.nextLine();
            System.out.println("Enter the value of the item");
            float value = Float.valueOf(sc.nextLine());
            System.out.println("Enter the number of day left to expire");
            int dayLeft = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the name of the department press if no department");
            String department = sc.nextLine();
            System.out.println("Enter the supplier of the item press if no supplier");
            String supplier = sc.nextLine();

            Item newItem = new Item(name, value, dayLeft, supplierFactory.getInstance(supplier.toUpperCase()), departmentFactory.getInstance(department.toUpperCase()));
            store.addItem(newItem);

            System.out.println("Press 0 to exit");
            exit=sc.nextLine().equals("0");

        } while (!exit);
    }

    private static void updatePrice(int numberOfDays, Store store){
        for(int i=0;i<numberOfDays;i++){
            store.updatPrices();
        }
    }


}
