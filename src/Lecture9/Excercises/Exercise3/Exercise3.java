package Lecture9.Excercises.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Product watch = new Product("Watch", "Electronics", 99, 20, true);
        Product phone = new Product("Phone", "Electronics", 101, 60, false);
        Product hat = new Product("Hat", "Clothing", 150, 10, false);

        System.out.println("-----------------");
        watch.printInfo();
        watch.setOnSale();
        watch.printInfo();

        System.out.println("-----------------");
        phone.printInfo();
        phone.setOnSale();
        phone.printInfo();

        System.out.println("-----------------");
        hat.printInfo();
        hat.setOnSale();
        hat.printInfo();
        System.out.println("-----------------");
    }
}