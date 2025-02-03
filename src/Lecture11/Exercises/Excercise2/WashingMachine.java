package Lecture11.Exercises.Excercise2;

public class WashingMachine extends Appliance {

    int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity) {
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;

    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("Washing machine started! (Load capacity: " + loadCapacity + "kg)");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Load Capacity: " + loadCapacity + "kg");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        loadCapacity = 0;
        System.out.println("Load Capacity: " + loadCapacity + "kg");
    }
}

