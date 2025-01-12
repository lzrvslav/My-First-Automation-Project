package Lecture5.Exercises;

public class Exercise6 {
    public static void main(String[] args){
        forLoop();
    }
    public static void forLoop(){
        int[] numbers = {10, 20, 30};
        int total = 0;
        for (int i=0; i<numbers.length; i++){
            total += numbers[i];
        }
        if (numbers.length > 0){
            double average = (double) total / numbers.length;
            System.out.println("Average: " +average);
        }
    }
}
