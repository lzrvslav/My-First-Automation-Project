package Lecture10.Exercises.Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/Lecture10/Exercises/Exercise2/testFile.txt"));
            String content = scanner.nextLine();
            int number = Integer.parseInt(content);
            System.out.println("The square root of " + number + " is: " + Math.sqrt(number));
        }catch (FileNotFoundException InternalExceptionMessage){
            System.out.println("File not found.");
        }catch (NumberFormatException InternalExceptionMessage) {
            System.out.println("Invalid content in the file.");
        }finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}
