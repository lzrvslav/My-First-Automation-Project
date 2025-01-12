package Lecture5.Exercises;

public class Exercise4 {
    public static void main(String[] args){
        forEachLoop();
    }
    public static void forEachLoop(){
        int[] numbers = {1, 3, 5, 7, 10, 12, 20, 15, 25};
        for (int i:numbers){
            if (i % 5 == 0){
                System.out.println("First multiple of 5 is " +i);
                break;
            }
        }
    }
}
