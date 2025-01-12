package Lecture5.Exercises;

public class Exercise3 {
    public static void main(String[] args){
        forLoop();
    }
    public static void forLoop(){
        int [] list1 = {10, 20, 30, 40, 50};
        int index = 0;
        for (int i = list1.length - 1; i >=0; i--){
            System.out.println(" ");
            System.out.println("Index: " +index);
            System.out.println("Number: " + list1[i]);
            index++;
        }
    }
}
