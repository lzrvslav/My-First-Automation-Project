package Lecture6.Exercises;

public class Exercise1 {
    public static void main(String[] args){
        SumOfElements();
    }
    public static void SumOfElements() {
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers is: " +sum);
    }
}
