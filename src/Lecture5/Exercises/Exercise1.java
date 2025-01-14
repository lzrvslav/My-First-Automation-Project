package Lecture5.Exercises;

public class Exercise1 {
    public static void main(String[] args){
        forExcercise();
        forEachExcersise();
    }
    public static void forExcercise(){
        int[] numbers = {1, 2, 3, 4, 5, 1}; // Array of numbers.
        int largestNumber = numbers[0]; // Assume the first number is the largest.
        for (int i=0; i < numbers.length; i++){ // For loop go through each number.
            if (numbers[i] > largestNumber){ // Check if the current number is larger than the current largest.
                largestNumber = numbers[i]; // Update the largest number.
            }

        }
        System.out.println("Largest number is: " +largestNumber);
    }
    public static void forEachExcersise(){
        int[] numbers = {1, 2, 3, 4, 5, 1}; // Array of numbers.
        int largestNumber = numbers[0]; // Assume the first number is the largest.
        for (int number:numbers) { // For-each loop go through each number.
            System.out.println("Current largest number is: " +number);
            if (number > largestNumber){
                // Compare each number to the current larges.
                largestNumber = number; // Update the largest number.
            }
        }
        System.out.println("Largest number is: " +largestNumber);
    }
}
