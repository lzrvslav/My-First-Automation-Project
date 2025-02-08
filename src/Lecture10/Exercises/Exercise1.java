package Lecture10.Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        handleInputErrors();
    }

    private static void handleInputErrors() {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Please enter integer: ");
            try {
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Entered valid number: " +number);
            break;
            }catch (NumberFormatException InternalExceptionMessage){
            System.out.println("Not a valid number, please try again.");
            }
        }
        scanner.close();
    }
}