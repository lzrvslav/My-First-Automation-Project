package Lecture8.Exercises;

public class Excercise2 {
    public static void main(String[] args) {
        calculateAverage(30, 2, 10);
    }
    public static void calculateAverage(double a, double b, double c) {
        double average = ((a+b+c)/3);
        System.out.println("The average number is: " +average);
    }
}