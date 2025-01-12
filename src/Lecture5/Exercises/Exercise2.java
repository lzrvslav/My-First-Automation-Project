package Lecture5.Exercises;

public class Exercise2 {
    public static void main(String[] args){
        forEach();
    }
    public static void forEach(){
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int largestNumber = numbers[0];
        for (int number:numbers) {
            if (number % 5 ==0){
                System.out.println("The number divisible by 5 is: " +number);
                if (number > 150){
                    System.out.println("Greater number than 150 is: " +number);
                    break;
                }
            }
        }
    }
}
