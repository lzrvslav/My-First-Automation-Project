package Lecture9;

public class Cake {
    // Attribute (Field/Property) of the given class Cake.
    // These are variables that hold the data or state of an object.
    // Each attribute has a type, a name, and can hold a value - it can be String Integer, Arrays and all the others.
    // Attribute (Field/Property) of the given class Cake.

    // Default Values must contain any contain of value.

    static String flavour = "Vanilla";
    //String flavour = "Vanilla"; // Default value is "Vanilla"

    int sliceNumber; // Default value is 0

    String decoration; // Default value is 'null'

    boolean isVegan = false;

    // Protected field/property
    // Cannot be edited from outside
    private int numberOfEggs = 1;

    // Class methods:
    public String addFlavour(String flavour){
        this.flavour = this.flavour + " and " + flavour;
        return this.flavour;
    }
    //
    public void usedEggs(int eggs){ // The method takes one input, which is an integer representing the number of eggs used.
        this.numberOfEggs = eggs; // Updates the numberOfEggs variable with the value of the input 'eggs'.
    }
    //
    public void printUsedEggs(){
        System.out.println("The number of used eggs is: " +numberOfEggs);
    }

}
