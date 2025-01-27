package Lecture9.Excercises.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String productName;
    public String category;
    public int stockQuantity;
    public double currentPrice;
    public boolean onSale;

    // Excercise 4 - Enhancing the Product class.
    private static String categoryOnSale = null;
    private static List<Product> allProducts = new ArrayList<>();

    public Product(String productName, String category, double price, int stockQuantity, boolean onSale ){
        this.productName = productName;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.currentPrice = price;
        this.onSale = category.equals(categoryOnSale);
        allProducts.add(this);
    }

    public void setOnSale() {
        this.onSale = true;
        System.out.println("-----------------");
        System.out.println("Product " +productName+ " is now ON SALE with a 10% discount applied!");
        System.out.println();
    }
    // Excercise 4 - Enhancing the Product class.
    public void updateCategory(String newCategory) {
        this.category = newCategory;
        this.onSale = newCategory.equals(categoryOnSale);
    }
    // Excercise 4 - Enhancing the Product class.
    public static void updateSaleCategory(String newCategoryOnSale) {
        categoryOnSale = newCategoryOnSale;
        for (Product product : allProducts) {
            product.onSale = product.category.equals(categoryOnSale);
        }
    }

    public void printInfo(){
        double finalPrice  = this.currentPrice;
        if (this.onSale && this.currentPrice > 100) {
            finalPrice  = this.currentPrice * 0.90;
        }

        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + finalPrice   );
        System.out.println("On SALE: " + (onSale ? "True" : "False"));
    }
    // Excercise 4 - Enhancing the Product class.
    public static void printAllProducts() {
        for (Product product : allProducts) {
            product.printInfo();
            System.out.println("-----------------");
        }
    }
}