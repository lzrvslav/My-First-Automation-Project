package Lecture8.Exercises;

import java.util.Arrays;

public class Excercise5 {
    public static void main(String[] args) {
        int[] numbers = {8, 10, 9, 11, 2};
        secondLargestInArray(numbers);
    }
    private static int secondLargestInArray(int [] array) {
        System.out.println("The array contains the following numbers: " + Arrays.toString(array));
        Arrays.sort(array);
        int index = array[array.length - 2];
        System.out.println(" ");
        System.out.println("Second largest number in the array is: " +index);
        return index;
    }
}