package Lecture11.Polymorphism;

// extend Vehicle refers to Vehicle in Polymorphism
public class Car extends Vehicle{
    // To associate "super" we need to have a constructor, and it will set its variables.
    // Contractor has the same name as the Class and accepts some parameters.
    // The Contractor will set these and variables (in super) and it will get them.
    // The Contractor gets properties from Vehicle class and Car class and.
    // The program (Lecture11) can take advantage of the definition of objects.
    public Car(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType){
        super(brand, maxSpeed, price);
        //
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    // Additional attributes specific to Car
    public int numberOfDoors = 2; // Default number of doors

    public String fuelType; // Type of fuel.

    // Method to play music
    public void playMusic (){
        System.out.println("Start radio");
    }

    // Method to stop music
    public void stopMusic(){
        System.out.println("Stop radio");
    }

    public void stopEngineOnTrafficLight(){
        //We use super() to call the constructor/method of the Parent class
        // ~ to initialize certain properties.
        super.stopEngine();
        System.out.println("<Engine stopped>");
    }

    // Override
    public boolean stopEngine(){
        this.playMusic();
        return false;
    }

    public void printInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
        System.out.println("Number of doors: " + this.numberOfDoors);
        System.out.println("Fuel type: " + this.fuelType);
    }
}
