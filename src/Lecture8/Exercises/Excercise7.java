package Lecture8.Exercises;

public class Excercise7 {
    public static void main(String[] args) {
        getLastChar("Slav");
    }
    private static void getLastChar(String string) {
        if (string.isEmpty()) {
            System.out.println("Cannot display the last character because the string is empty.");
        } else {
            System.out.println("Last character of getLastChar is: " + string.charAt(string.length() - 1));
        }
    }
}