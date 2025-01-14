package Lecture5.Exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        javaGame();
    }
    public static void javaGame(){
        System.out.println("This Java program generates a random number!");
        System.out.println("Guess the number by entering a value between 1 and 100: ");
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess = scanner.nextInt();
        while (guess != randomNumber){
            if (guess > randomNumber){
                System.out.println("Number is too high:" +guess);
            }
            if (guess < randomNumber){
                System.out.println("Number is too low: " +guess);
            } guess = scanner.nextInt();
        }
        System.out.println("You guessed the number! " +guess);
        scanner.close();
    }
}
