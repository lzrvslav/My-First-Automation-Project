package Lecture11.Exercises.Excercise2;

public class Main {
    public static void main(String[] args) {

//        Appliance washingmachine = new WashingMachine("LG", 1000, 7);
//        Refrigerator refrigerator = new Refrigerator("Beko", 150);




        Microwave microwave = new Microwave("Bosch", 900,100,10);
        System.out.println("----------------");
        microwave.addFood(10);
        microwave.setTemperature(10);
        System.out.println("----------------");
        microwave.heat();
        System.out.println("----------------");
        microwave.printInfo();
        System.out.println("----------------");
        microwave.factoryReset();
        System.out.println("----------------");
        microwave.turnOn();
        System.out.println("----------------");

//        Appliance washingmachine2 = new WashingMachine("Samsung",800, 8);
//
//        washingmachine2.printInfo();
//        washingmachine2.turnOn();
//
//        System.out.println("----------------");
//        washingmachine2.factoryReset();
//        washingmachine2.printInfo();




//
//        washingmachine.turnOn();
//        washingmachine.printInfo();
//
//        refrigerator.turnOn();
//        refrigerator.printInfo();
//
//        refrigerator.setTemperature(-3);
//        refrigerator.printInfo();
    }
}
