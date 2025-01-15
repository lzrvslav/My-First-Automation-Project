package Lecture7.Exercises;

import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args){
        guestList();
    }
    public static void guestList() {
        // HashSet to store the guestList with String values.
        HashSet<String> guestList = new HashSet<>();
        System.out.println("#1: ");
        // Add guest names to the list
        guestList.add("Slav");
        guestList.add("Ivan");
        guestList.add("Diana");
        guestList.add("Maria");
        System.out.println("The following guest are added to the guestList: " +guestList);

        System.out.println(" ");
        System.out.println("#2: ");
        // Attempt to add Slav again
        guestList.add("Slav");
        System.out.println("Attempt to add guest Slav again:");
        System.out.println("Do we have contact name Slav in guestList? ->  " +guestList.add("Slav"));

        System.out.println(" ");
        System.out.println("#3: ");
        // Removing a guest who can't attend to the party
        guestList.remove("Maria");
        System.out.println("Our guestList contains the following guests: " +guestList);

        guestList.add("Kalina");

        System.out.println(" ");
        System.out.println("#4: ");
        // Check if a specific person is on the guest list
        System.out.println(" Do we have contact name Ivan in guestList? -> " + guestList.contains("Ivan"));

        System.out.println(" ");
        System.out.println("#5: ");
        for (String guest:guestList);
        System.out.println("The following guests will attend the party: " +guestList);
    }
}
