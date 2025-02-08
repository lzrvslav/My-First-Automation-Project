package Lecture11.Polymorphism;

public class Vehicle {
    // Contractor has the same name as the Class and accepts some parameters.
    // Passing data to the constructor when creating a new object, with each value being written to the corresponding field of the object.
    public Vehicle(String brand, int maxSpeed, int price){
        // Keyword 'this' refers directly to the variable that is inside as a field or property
        // (this.brand = brand;) refers directly to (public String brand;)
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    // Attribute protection class must be public to be used outside the class.
    // Public attributes can be accessed directly from subclasses and other classes.
    public String brand;

    public int maxSpeed;

    public int price;

    // If we don't set a default boolean value - it will always be false.
    // Boolean flag to track if the engine is started (default is false).

    // The method startEngine() and stopEngine() reflects on the object we manage.
    public boolean isEngineStarted = false;

    // Methods (startEngine(), stopEngine()) that can be used by any subclass.
    public boolean startEngine(){
        // this.isEngineStarted = true;
        System.out.println("Start Vehicle Engine");
        return true; // The engine is now started

    }   public boolean stopEngine(){
        // We make sure that when we stop the engine, the engine is stopped
        this.isEngineStarted = false;
        System.out.println("Stop Vehicle Engine");
        return false; // The engine is now stopped
    }

    public void printInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Price: "+this.price);
    }
}
