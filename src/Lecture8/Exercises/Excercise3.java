package Lecture8.Exercises;

public class Excercise3 {
    public static void main(String[] args) {
        getMiddleChar("Gorillaz");
    }
    private static void getMiddleChar(String string) {
        int position;
        int length;
        if (string.length() % 2 == 0){
            position = string.length() / 2 - 1;
            length = 2;
        } else {
            position = string.length() / 2;
            length = 1;
        }
        System.out.println("Middle character in the String : " +string.substring(position, position + length));
    }
}