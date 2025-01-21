package Lecture8.Exercises;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Excercise6 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 4, 4, 3, 3, 1};
        removeDuplicateNumbers(numbers);
    }
    private static int removeDuplicateNumbers(int[] numbers) {
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        int i;
        for (i = 0; i < numbers.length; i++)
            uniqueNumbers.add(numbers[i]);
        System.out.println(uniqueNumbers);
        return i;
    }
}