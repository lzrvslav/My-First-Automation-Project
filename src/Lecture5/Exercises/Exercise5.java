package Lecture5.Exercises;

public class Exercise5 {
    public static void main(String[] args){
        forEachContinueStatement();
    }
    public static void forEachContinueStatement(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : numbers) {
            if (i % 3 == 0){
            continue;
        }
            System.out.println("Number that multiples of 3: " +i);
        }
    }
}
