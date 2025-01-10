package Lecture5;

public class Lecture5 {
    public static void main(String[] args) {
        // forLoop();
        // nestedForLoop();
        whileLoop();
    }

    public static void forLoop() {
        System.out.println(" ");
        System.out.println("This is 1-st 'forLoop': ");
        // A for loop is a process of repeating a block of code a specified number of times until a given condition is met.
            // ~this process repeats itself by checking the condition until the condition becomes false, at which point the loop ends.
        // Statement 1, sets a variable before the loop starts (int i = 0).
        // Statement 2 defines the condition for the loop to run ('i' must be <= to 10).
            // ~ if the condition is TRUE, the loop will start over again.
            // ~ if it is FALSE, the loop will end.
        // Statement 3 increases a value (i++) each time the code block in the loop has been executed.

        for (int i = 0; i <= 10; i++) {
            System.out.println("This is 'i' number: " +i);
        }
        System.out.println(" ");
        System.out.println("This is 2-nd 'forLoop': ");
        for (int i = 0; i<= 10; i++){
            System.out.println("This is 'i' number: " +i);
            i++;
        }
        System.out.println(" ");
        System.out.println("This is 3-th 'forLoop': ");
        for (int i = 0; i <= 10; i = i + 4){
            System.out.println("This is 'i' number: " +i); // Print even values between 0 and 10
        }
        System.out.println(" ");
        System.out.println("This is 4-th 'forLoop': ");
        for (int i = 0; i <= 100; i = i + 15){
            System.out.println("This is 'i' number: " +i);
        }
    }
    public static void nestedForLoop(){
        // Outer loop
        System.out.println(" ");
        for (int i = 0; i <= 2; i++){
            System.out.println("Outer loop: " + i);
            // The "inner loop" will be executed one time for each iteration of the "Outer loop".
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner loop: " +j);
            }
            for (int y = 1; y <=3; y++){
                System.out.println("Second Inner loop: " + y);
            }
            for (int z = 1; z <=3; z++){
                System.out.println("Third Inner loop: " + z);
            }
        }
    }
    public static void whileLoop(){
        // We us it when we don’t know beforehand how many times is needed to repeat the instructions.
        // The provided condition is checked before each repetition.
            // As long as this condition is true, the instructions keep repeating.
        int num = 5;
        while (num < 10){
            System.out.println(num);
            num++;
        }
        while (num < 15){
                System.out.println(num);
                num++;
        }
    }
}

