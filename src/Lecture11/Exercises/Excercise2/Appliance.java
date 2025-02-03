package Lecture11.Exercises.Excercise2;

public class Appliance {

    String brand;
    int powerConsumption;
    boolean isOn;

    public Appliance(String brand, int powerConsumption){
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Appliance is ON.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Appliance is OFF.");
    }

    public void factoryReset(){
        turnOff();
        System.out.println("Appliance is reset to factory settings!");
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", Power: " + powerConsumption + "W, Status: " + (isOn ? "ON" : "OFF"));
    }
}
