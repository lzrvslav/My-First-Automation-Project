package Lecture8.Exercises;

public class Excercise4 {
    public static void main(String[] args) {
        countStringWords("Slav Lazarov");
    }
    private static void countStringWords(String string) {
        String words = new String(string);
        int countWords = words.split("\\s").length;
        System.out.println("Numbers of words in string: " +countWords);
    }
}