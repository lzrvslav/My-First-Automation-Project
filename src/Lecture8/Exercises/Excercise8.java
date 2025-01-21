package Lecture8.Exercises;

import java.util.Scanner;

public class Excercise8 {
    public static void main(String[] args) {
        isEven();
    }
    private static void isEven() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number % 2 == 0);
    }
}
