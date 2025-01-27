package Lecture9;

public class Lecture9 {
    // Methods: These are functions defined within a class that
    // ~ describe the behaviors or actions that an object can perform.
    public static void main(String[] args) { //Object behaviour
        //secondCakeCreation();
        //createCars();

        // Create new Object print from class PrintLine
        // Non-static method call it in a static method
        // Blueprint is made to be called
        PrintLine print = new PrintLine();
        print.printLine();

    }

    public static void secondCakeCreation(){


        // Create new Object myCake from class Cake
        Cake myCake = new Cake(); // Scope of the method.
        // Set object properties
        myCake.flavour = "Vanilla"; //Object state
        myCake.decoration = "Candies"; //Object state
        myCake.sliceNumber = 12;
        // Print  object properties
        System.out.println("My cake flavour: " +myCake.flavour);
        System.out.println("Is myCake vegan: " +myCake.isVegan);
        System.out.println("Decoration of myCake is: " +myCake.decoration);
        System.out.println("The number of slices in myCake is: " +myCake.sliceNumber);
        // We add Mango to flavour and flavour will be Vanilla + Mango
        System.out.println("My cake new flavour is: " + myCake.addFlavour("Mango"));
        System.out.println(myCake.flavour);
        // Print the number of used eggs:
        myCake.printUsedEggs();


        // Create new Object secondCake from class Cake
        Cake secondCake = new Cake();
        System.out.println("Second cake before change the default flavour:  "+secondCake.flavour);
        // Set object properties
        secondCake.flavour = "Chocolate"; // Object state
        secondCake.decoration = "Candies"; // Object state
        secondCake.sliceNumber = 8;
        secondCake.isVegan = true;
        //The methods we develop in our class reflex on the data in the class which can be.
        // Tell the "Cake" object how many eggs were used:
        secondCake.usedEggs(0);
        // Print the number of used eggs:
        secondCake.printUsedEggs();
        // Print object properties
        System.out.println("Second cake flavour: " +secondCake.flavour);
        System.out.println("Is secondCake vegan: " +secondCake.isVegan);
        System.out.println("Decoration of secondCake is: " +secondCake.decoration);
        System.out.println("The number of slices in secondCake is: " +secondCake.sliceNumber);

        Cake myLastCake = new Cake();
        // It takes the last value from row 36, because the property is static.
        System.out.println("This is my last cake flavour : " +myLastCake.flavour);

    }

    public static void createCars(){
        Cars firstCar = new Cars();
        printCarsDetails(firstCar, "My first car");
        System.out.println(" ");

        Cars my2Car = new Cars("Red");
        printCarsDetails(my2Car, "My 2 car");
        System.out.println(" ");

        Cars my3Car = new Cars("White", "Automatic");
        printCarsDetails(my3Car, "My 3 car");
        System.out.println(" ");

        Cars my4Car = new Cars("Silver", "Manual", false);
        my4Car.isEco = false;
        printCarsDetails(my4Car, "My 4 car");
        System.out.println(" ");

        Cars my5Car = new Cars("Purple", "Auto", false, "Volvo");
        printCarsDetails(my5Car, "My 5 car");
        System.out.println(" ");

        Cars my6Car = new Cars("Green", "Manual", false, "Ford",2025, true);
        printCarsDetails(my6Car, "My 6 car");
        System.out.println(" ");

        Cars my7Car = new Cars("Blue","Automatic",true, "Citroen", 2019, true);
        printCarsDetails(my7Car, "My 7 car");
        System.out.println(" ");


    }
    public static void printCarsDetails(Cars car, String objectName){
        System.out.println(objectName+ " color is: " +car.getColor());
        System.out.println(objectName+ " transmission is: " +car.getTransmission());
        System.out.println("Is" +objectName+ " electric: " +car.getIsElectric());
        System.out.println(objectName + " brand is: " + car.getBrand());
        System.out.println("The year of " + objectName + " is: " + car.getYear());
        System.out.println("Is " + objectName + " eco friendly: " + car.isEco);
    }


}
