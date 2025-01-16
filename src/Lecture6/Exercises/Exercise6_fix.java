package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6_fix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> lotteryNumbers = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Lottery Number");
            System.out.println("2. View Winning Numbers");
            System.out.println("3. Check Winning Number");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter number: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid number.");
                    scanner.next();
                    continue;
                }
                int number = scanner.nextInt();
                if (lotteryNumbers.contains(number)) {
                    System.out.println("Number exists.");
                } else {
                    lotteryNumbers.add(number);
                    System.out.println("Number added.");
                        }
            } else if (choice == 2) {
                System.out.println("Winning Numbers: " + (lotteryNumbers.isEmpty() ? "None" : lotteryNumbers));
            } else if (choice == 3) {
                System.out.print("Enter number to check: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid number.");
                    scanner.next();
                    continue;
                }
                int number = scanner.nextInt();
                System.out.println(lotteryNumbers.contains(number) ? "Winning number!" : "Not a winning number.");
            } else if (choice == 4) {
                System.out.println("Exiting Lottery Manager. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}


