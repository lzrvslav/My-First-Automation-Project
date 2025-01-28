package Lecture10.Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        handleAgeValidation();
    }
    private static void validateAge(int age) throws IllegalArgumentException {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Age is not within a valid range (0-120).");
        }
    }
    private static void handleAgeValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age " + age + " is valid.");
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid age: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
