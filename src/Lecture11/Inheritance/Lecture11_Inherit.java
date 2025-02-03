package Lecture11.Inheritance;

// ➢ Subclass (Child Class) that inherits from Vehicle
// ➢ Importing the Car class from the Inheritance package

public class Lecture11_Inherit {
    // ➢ Main Class (Lecture11) creates objects (audi and bmw) from the Car class.
    // ➢ Since Car is a child of Vehicle, both objects can use attributes and methods from Vehicle.
    // ➢ Calling methods (e.g., startEngine(), playMusic()).
    public static void main(String[] args) {

        // Creating an instance (object) of Car named 'audi'.
        Car audi = new Car("Audi", 180,5000, 5,"Gasoline");
        audi.isEngineStarted = audi.startEngine(); // Start the engine and update its status.
        audi.fuelType = "Gasoline"; // Assign fuel type to Audi.
        audi.playMusic(); // Call method to start playing music.

        // Creating another instance (object) of Car named 'bmw'.

        Car bmw = new Car("BMW", 150,3000, 5,"Diesel");
        bmw.isEngineStarted = bmw.startEngine(); // Start the engine for BMW.
        bmw.stopMusic();  // Call method to stop music.
        // bmw.brand = "BMW"; // Assign brand name.

        // Displaying the results:
        System.out.println("The fuel type of Audi is: " +audi.fuelType);
        System.out.println("Is Audi engine started: " +audi.isEngineStarted);
        System.out.println("The brand of BMW is: " +bmw.brand);
        System.out.println("Is BMW engine started: " +bmw.isEngineStarted);
        // It does not reflect the change in any way and therefore
        // stopEngine() must be extended otherwise will be true
        //If the Method does not reflect on the object we are managing,
        // ~ we must explicitly say that we want to change its value through our method.
        bmw.stopEngine();
        System.out.println("Is BMW engine started: " +bmw.isEngineStarted);

        System.out.println("-------------------");
        System.out.println("TrafficLight");
        bmw.isEngineStarted = bmw.startEngine();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.stopEngineOnTrafficLight();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        System.out.println("-------------------");

        Vehicle baseCar = new Vehicle("Lada", 120,1500);
        baseCar.isEngineStarted = baseCar.startEngine();
        // baseCar.price = 1500;
        System.out.println("Is base car engine started: " + baseCar.isEngineStarted);
        System.out.println("Base car price is: " + baseCar.price);
    }
}
