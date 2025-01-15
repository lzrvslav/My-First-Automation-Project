package Lecture7;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Lecture7 {
    public static void main(String[] args) {
        //demoHashMapOperations();
        demoHashSetOperations();
    }
    public static void demoHashMapOperations() {
        // HashMap to store the food menu with Integer keys and String values
        HashMap<Integer, String> foodStore = new HashMap<Integer, String>();
        foodStore.put(1, "Chips");
        foodStore.put(2, "Banana");
        foodStore.put(3, "Ice-cream");
        foodStore.put(4, "Peanuts");

        // Print the current state of the food store to the console.
        System.out.println("#1: ");
        System.out.println("This is our food store: " + foodStore);

        foodStore.clear();
        // Print the food store to the console after it has been cleared.
        System.out.println("#2: ");
        System.out.println("This is our food store after clear: " +foodStore);

        // Check if the food store is empty and print the result to the console.
        System.out.println("#3: ");
        System.out.println("Is the food store empty? -> " +foodStore.isEmpty());

        System.out.println("#4: ");
        System.out.println("Adding the key value pairs again!");
        foodStore.put(1, "Chips");
        foodStore.put(2, "Banana");
        foodStore.put(3, "Ice-cream");
        foodStore.put(4, "Peanuts");

        // Check if the food store contains "Banana" as a value and print the result to the console.
        System.out.println("#5: ");
        System.out.println("Do we have Banana in our food store? -> " +foodStore.containsValue("Banana"));

        // Check if the food store contains the key 5 and print the result to the console.
        System.out.println("#6: ");
        System.out.println("Do we have have 5 key in our food store? -> " +foodStore.containsKey(5));

        // Remove the entry with key 3 from the food store and print the removed value to the console.
        System.out.println("#7: ");
        System.out.println("Food store after remove key 3: " +foodStore.remove(3));
        System.out.println("This is our food store: " +foodStore);

        System.out.println("#8: ");
        // Removing the entry with key 2 and value "Banana" from the food store, and print whether the removal was successful.
        System.out.println("Food store after remove key 2 and value Banana: " + foodStore.remove(2, "Banana"));
        // Repeat the attempt to remove key 2 and value "Banana", and print whether it was successful.
        System.out.println("Food store after remove key 2 and value Banana: " +foodStore.remove(2, "Banana"));
        // Print the current state of the food store to the console.
        System.out.println("This is our food store: " +foodStore);

        System.out.println("#9: ");
        // Print the set of all key-value pairs (entries) in the food store to the console
        System.out.println("Entry Set of food store: " +foodStore.entrySet());

        // Print the set of all keys in the food store to the console
        System.out.println("#10: ");
        System.out.println("Key Set of food store: " +foodStore.keySet());

        // Add the key-value pair (3, "Banana") to the food store only if key 3 is not already present.
        System.out.println("#11: ");
        foodStore.putIfAbsent(3, "Banana");
        System.out.println("This is our food store: " +foodStore);

        // Attempt to add the key-value pair (3, "BananaS") to the food store, but it will NOT update if key 3 already exists.
        System.out.println("#12: ");
        foodStore.putIfAbsent(3, "BananaS");
        System.out.println("This is our food store: " +foodStore);

        // Update the value associated with key 1 to "Tortilla Chips", replacing the previous value "Chips".
        System.out.println("#13: ");
        foodStore.put(1, "Tortilla Chips");
        System.out.println("This is our food store: " +foodStore);

        // Retrieve and print the value associated with key 4 from the food store.
        System.out.println("#14: ");
        System.out.println("This is value of key 4 of our food store: " +foodStore.get(4));

        // Print the value of key 5 or a default value if key 5 is not present in the food store
        System.out.println("#15: ");
        System.out.println("This is value of the default value of key 5 of our food store: "
                +foodStore.getOrDefault(5, "Default value: "));

        // Retrieve and print the value associated with key 5 from the food store.
        System.out.println("#16: ");
        System.out.println("This is value of key 5 of our food: " +foodStore.get(5));

        // Retrieve and print the value associated with key 4 from the food store.
        System.out.println("#17: ");
        System.out.println("This is the value of the default value of key5 of our food store: "
                + foodStore.getOrDefault(3,"Default value"));
        System.out.println("This is our food store: " +foodStore);

        // Replace the value of key 4 with "Apples" and print the previous value
        System.out.println("#18: ");
        System.out.println("Replace key 4 of our food store: " +foodStore.replace(4, "Apples"));
        System.out.println("This is our food store: " +foodStore);

        // // Replace the value of key 4 with "Apples" only if the current value is "Peanuts", and print whether the replacement was successful.
        System.out.println("#19: ");
        System.out.println("Replace key 4 of our food store: " +foodStore.replace(4, "Peanuts","Apples"));
        System.out.println("This is our food store: " +foodStore);

        // Replace the value of key 4 with "Peanuts" only if the current value is "Apples", and print whether the replacement was successful.
        System.out.println("#20: ");
        System.out.println("Replace key 4 of our food store: " +foodStore.replace(4,"Apples","Peanuts"));
        System.out.println("This is our food store: " +foodStore);

        // Creating copy of the food store and assign it to cloneStore, then print the cloned store's key-value pairs.
        // When the map is cloned, the key-value pairs are redistributed into the new map's buckets, potentially resulting in a different order.
        // HashMap does not guarantee the order of its keys or values.
        System.out.println("#21: ");
        Object cloneStore = foodStore.clone();
        System.out.println("Clone store key values: " +cloneStore);

        // Retrieve all the values from the food store as a Collection and print them.
        System.out.println("#22: ");
        Collection<String> valuesCollection = foodStore.values();
        System.out.println("This is all the values of foodStore in collection: "+ valuesCollection);

        // Loops through each key in the food store's key set, retrieves its value using get(key), and prints the key-value pair
        System.out.println("#23: ");
        for (Integer key : foodStore.keySet()){
            System.out.println("This is the value on " +key+ ": "+foodStore.get(key));
        }
    }

    public static void demoHashSetOperations(){
        // Create a new HashSet to store unique food items.
        HashSet<String> foodSet = new HashSet<>();
        foodSet.add("Potatoes");
        foodSet.add("Watermelon");
        foodSet.add("Cashew");
        foodSet.add("Soda");
        System.out.println("#1: ");
        System.out.println("This is our foodSet: " +foodSet);

        // Remove "Soda" from the HashSet and print whether the removal was successful.
        System.out.println("#2: ");
        System.out.println("Removed Soda from foodSet: -> " +foodSet.remove("Soda"));


        // Since "Soda" has already been removed, this will return false.
        System.out.println("#3: ");
        System.out.println("Removed Soda from foodSet: -> " +foodSet.remove("Soda"));

        // Add item to the HashSet.
        System.out.println("#4: ");
        foodSet.add("Water");
        System.out.println("This is our foodSet: " +foodSet);

        // Add Soda item back to the HashSet.
        System.out.println("#4: ");
        foodSet.add("Soda");
        System.out.println("This is our foodSet: " +foodSet);

        // Iterate through each item in the HashSet and print it
        System.out.println("#4: ");
        System.out.println("Iterate through each item in the HashSet: ");
        for(String item:foodSet){
            System.out.println("This is food from foodSet:" +item);
        }

    }
}
