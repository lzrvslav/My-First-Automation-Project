package Lecture7.Exercises;

import java.util.HashMap;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args){
        storeInventory();
    }
    public static void storeInventory() {

        HashMap<String, Integer> storeInventory = new HashMap<>();

        System.out.println("#1: ");
        // Add several products to the inventory with their quantities
        storeInventory.put("Chicken", 20);
        storeInventory.put("Water", 25);
        storeInventory.put("Banana", 30);

        System.out.println("#2: ");
        // Check the quantity of a specific product.
        System.out.println("What is the quantity of Water? : -> " +storeInventory.get("Water"));

        System.out.println("#3: ");
        // Restock a product by increasing its quantity.
        boolean isRestocked = storeInventory.replace("Banana", storeInventory.get("Banana"), (storeInventory.get("Banana")+35));
        System.out.println("Banana quantity is restocked with 35");

        System.out.println("#4: ");
        // Mark a product as out of stock by setting its quantity to zero.
        if (isRestocked) {
            System.out.println("Restock Banana quantity with 35, the new quantity is: " + storeInventory.get("Banana"));
        }
        storeInventory.replace("Water", 0);
        storeInventory.replace("Banana", 0);

        System.out.println(" ");
        // Option 1
        System.out.println("Option 1");
        ArrayList<String> outOfStock = new ArrayList<String>();
        for (String key: storeInventory.keySet()){
            if (0 == storeInventory.get(key)){
                outOfStock.add(key);
            }
        }
        for (String outOfStockItem : outOfStock) {
            System.out.println("The following product is out of stock: " + outOfStockItem);
        }
        System.out.println(" ");
        // Option 2
        System.out.println("Option 2");
        for (String key: storeInventory.keySet()){
            if (0 == storeInventory.get(key)) {
                System.out.println("The following product is out of stock: " + key);
            }
        }
        System.out.println("#5: ");
        // Remove a product from the inventory.
        System.out.println("Remove Chicken from store: "+storeInventory.remove("Chicken"));

        System.out.println("#6: ");
        // Print the entire inventory to see the stock levels.
        System.out.println("Print the entire inventory: "+storeInventory);
        }
}
