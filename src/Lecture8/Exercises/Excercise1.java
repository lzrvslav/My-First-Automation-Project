package Lecture8.Exercises;

public class Excercise1 {
    public static void main(String[] args) {
        findSmallestNumber(2, 9, 1);
    }
    private static void findSmallestNumber(int a, int b, int c) {
        System.out.println("The smallest number is: " + Math.min(a, Math.min(b, c)));
    }
}