package Lecture11.Inheritance;

// ➢ The Car class inherits from Vehicle using 'extends Vehicle'.
// ➢ It inherits all the attributes and methods from 'Vehicle'.
// ➢ It also has additional attributes (numberOfDoors, fuelType).
// ➢ It adds new methods (playMusic(), stopMusic().
public class Car extends Vehicle {
    public Car(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType){
        super(brand, maxSpeed, price);
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
        super.stopEngine();
        System.out.println("<Engine stopped>");
    }
}
