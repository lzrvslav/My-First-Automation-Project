package Lecture9.Excercises.Exercise4;

import Lecture9.Excercises.Exercise3.Product;

public class Exercise4 {
    public static void main(String[] args) {
//
//        Lecture9.Excercises.Exercise3.Product watch = new Lecture9.Excercises.Exercise3.Product("Watch", "Electronics", 99, 20, true);
//        Lecture9.Excercises.Exercise3.Product phone = new Lecture9.Excercises.Exercise3.Product("Phone", "Electronics", 101, 60, false);
//        Lecture9.Excercises.Exercise3.Product hat = new Product("Hat", "Clothing", 150, 10, false);
//
//        System.out.println("-----------------");
//        watch.printInfo();
//        watch.setOnSale();
//        watch.printInfo();
//
//        System.out.println("-----------------");
//        phone.printInfo();
//        phone.setOnSale();
//        phone.printInfo();
//
//        System.out.println("-----------------");
//        hat.printInfo();
//        hat.setOnSale();
//        hat.printInfo();
//        System.out.println("-----------------");

        // Excercise 4 - Enhancing the Product class.
        Product headphones = new Product("Headphones", "Electronics", 99, 10, false);
        Product book = new Product("Book", "Literature", 30, 10, false);
        Product webCamera = new Product("Web camera", "Electronics", 101, 10, false);

        System.out.println("-----------------");
        System.out.println("Before setting sale category:");
        Product.printAllProducts();

        System.out.println("Set Electronics as sale category");
        Product.updateSaleCategory("Electronics");
        System.out.println("-----------------");

        System.out.println("After setting sale category:");

        Product.printAllProducts();

        System.out.println("Set book category to Electronics");
        book.updateCategory("Electronics");

        System.out.println("-----------------");
        System.out.println("After updating book category:");
        Product.printAllProducts();

    }
}
