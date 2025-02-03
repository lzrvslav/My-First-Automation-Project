package Lecture11.Exercises.Excercise2;

public class Microwave extends Appliance {
    int maxTemperature;
    int currentTemperature;
    int capacity;
    int currentLoad;

    public Microwave(String brand, int powerConsumption, int maxTemp, int capacity) {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemp;
        this.capacity = capacity;
        this.currentTemperature = 0;
        this.currentLoad = 0;
    }

    public void setTemperature(int temp) {
        if (temp >= 10 && temp <= maxTemperature) {
            currentTemperature = temp;
        } else {
            System.out.println("Invalid temperature! Must be between 10°C and " + maxTemperature + "°C");
        }
    }

    public void heat() {
        if (currentTemperature > 0) {
            System.out.println("Heating...");
        } else {
            System.out.println("Cannot heat, temperature not set!");
        }
    }

    public void addFood(int foodAmount) {
        if (currentLoad + foodAmount <= capacity) {
            currentLoad += foodAmount;
            System.out.println("Food added. Current load is: " + currentLoad + "L");
        } else {
            System.out.println("Not enough space! Max capacity is: " + capacity + "L");
        }
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        currentTemperature = 0;
        currentLoad = 0;
        System.out.println("Microwave reset: Temperature = " + currentTemperature + "°C, Load = " + currentLoad + "L");
    }
}
