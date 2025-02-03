package Lecture11.Exercises.Excercise2;


class Refrigerator extends Appliance {
    int temperature;

    public Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
        this.temperature = 0;
    }

    public void setTemperature(int temp) {
        if (temp >= -3 && temp <= 5) {
            temperature = temp;
        } else {
            temperature = 0;
        }
        System.out.println("Temperature set to: " + temperature + "°C");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Temperature: " + temperature + "°C");
    }

    @Override
    public void factoryReset(){
        super.factoryReset();
        temperature = 0;
        System.out.println("Temperature: " + temperature + "°C");
    }
}

