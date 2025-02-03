package Lecture11;

// from which package which one class we're going to use for our object creation
import Lecture11.Polymorphism.Car;
import Lecture11.Polymorphism.Bus;
import Lecture11.Polymorphism.Vehicle;

public class Lecture11_Poly {

    // ➢ Main Class (Lecture11) creates objects (audi and bmw) from the Car class.
    // ➢ Since Car is a child of Vehicle, both objects can use attributes and methods from Vehicle.
    // ➢ Calling methods (e.g., startEngine(), playMusic()).
    public static void main(String[] args) {

        // Creating an instance (object) of Car named 'audi'.
        // We create the object audi we call the constructor Car(new Car)and you give it the parameters.
        // Once submitted, we submit to "super" (the inherited constructor from Vehicles) the parameters.
        Car audi = new Car("Audi", 180,5000, 5,"Gasoline");
        audi.isEngineStarted = audi.startEngine(); // Start the engine and update its status.
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

        Vehicle baseCar = new Vehicle("Lada", 120,1500);
        baseCar.isEngineStarted = baseCar.startEngine();
        // baseCar.price = 1500;
        System.out.println("Is base car engine started: " + baseCar.isEngineStarted);
        System.out.println("Base car price is: " + baseCar.price);

        Bus myBus = new Bus("VW", 100, 3600, 9);
        System.out.println("My bus brand is: "+myBus.brand);
        myBus.returnNumberOfSeats();

        System.out.println("Is my bus engine started: " +myBus.isEngineStarted);
        System.out.println("My bus engine state: "+myBus.stopEngine());

        // Polymorphic Behavior:
        // When we create a Vehicle tesla (parent object) in it we can use the things that are from it.
        // Cars inherits it and in practice a Vehicle tesla can be created from the Cars type, because Cars is its successor,
        // ~ but when defining it will define only and only the part that is inside the Vehicle object.
        // numberOfDoors and fuelType are child properties of the children, Vehicle have no access and can't work with them.

        Vehicle tesla = new Car("Tesla", 190, 100000,5,"Electric");
        Vehicle partner = new Bus("Pejo", 140, 25000, 7);
        Vehicle testCar = new Vehicle("Slav", 250, 152);

//        System.out.println("Tesla info:");
//        System.out.println("Brand: "+tesla.brand);
//        System.out.println("Max speed: "+tesla.maxSpeed);
//        System.out.println("Price: "+tesla.price);
//
//        System.out.println("Partner info:");
//        System.out.println("Brand: "+partner.brand);
//        System.out.println("Max speed: "+partner.maxSpeed);
//        System.out.println("Price: "+partner.price);

        // Polymorphic Behavior:
        // Because printInfo() method is Overridden in all the three classes and is Overridden in the subclasses, we add additional parameters that
        // are used in this method (in its Override) and it can afford to use them.
        // This came from Polymorphism.
        tesla.printInfo();
        partner.printInfo();
        testCar.printInfo();

    }
}
