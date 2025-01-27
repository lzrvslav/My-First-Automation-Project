package Lecture6.Exercises;

public class Exercise4 {
    public static void main(String[] args){
    }
    public static void findingBiggestElement(){
            int[] numbers = {1, 2, 3, 4, 5, 1}; // Array of numbers.
            int biggestNumber = numbers[0]; // Assume the first number is the largest.
            for (int number:numbers) { // For-each loop go through each number.
                System.out.println("Current biggest number is: " +number);
                if (number > biggestNumber){
                    // Compare each number to the current larges.
                    biggestNumber = number; // Update the largest number.
                }
            }
            System.out.println("Biggest number is: " +biggestNumber);
        }
}
