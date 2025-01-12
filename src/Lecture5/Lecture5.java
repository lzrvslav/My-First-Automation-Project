package Lecture5;

public class Lecture5 {
    public static void main(String[] args) {
        //forLoop();
        //nestedForLoop();
        //whileLoop();
        //doWhile();
        //forEachLoop();
        //continueStatement();
        //breakStatementWhileLoop();
        //breakStatementDoWhileLoop();
    }
    public static void forLoop() {
        System.out.println(" ");
        System.out.println("This is 1-st 'forLoop': ");
        for (int i=0; i<=10; i++) { //
            System.out.println("This is 'i' number: " + i);
        }

        System.out.println(" ");
        System.out.println("This is 2-nd 'forLoop': ");
        for (int i=0; i<=10; i++) {
            System.out.println("This is 'i' number: " + i);
            i++;
        }

        System.out.println(" ");
        System.out.println("This is 3-th 'forLoop': ");
        for (int i=0; i<=10; i=i+4) {
            System.out.println("This is 'i' number: " + i);
        }

        System.out.println(" ");
        System.out.println("This is 4-th 'forLoop': ");
        for (int i=0; i<=100; i=i+15) {
            System.out.println("This is 'i' number: " + i);
        }

        System.out.println(" ");
        System.out.println("This is last 'forLoop': ");

        // Start from '0' -> it checks 'i' 0<=8 -> true (0<=8) -> executes the body, which is new value for 'i' (i = 8) -> it print in the console number 8 -> then after it updates the control variable with (i++).
        // The updated control variable 'i' = 9 -> it checks 'i' <=8 -> false (9>8) (9 is greater than 8) -> END of the for loop method!
        for (int i=0; i<=8; i++) {
            i=8;
            System.out.println("The 'i' number is: " + i);
        }

        System.out.println(" ");
        System.out.println("This is Infinite Loop: ");

        // Start from '0' -> it checks 'i' 0<=8 -> true (0<=8) -> executes the body which is new value for 'i' (i = 7) -> it print in the console number 7 -> then after it updates the control variable with (i++).
        // The updated control variable 'i' = 7 -> it checks 'i' <=8 -> true (0<=8) -> executes the body, which is new value for 'i' (i = 7) -> it print in the console number 7 -> it updates the control variable with (i++).
        // The updated control variable 'i' = 8 -> it checks 'i' <=8 -> true (0<=8) -> executes the body, which is new value for 'i' (i = 7) -> it print in the console number 7 -> it updates the control variable with (i++).
        // It wil repeat over and over again. That's what we call " Infinite Loop"

        for (int i=0; i<=8; i++) {
            i=7;
            System.out.println("The 'i' number is: " + i);
            if (i==7);
            break; // With break; we have one time execution of that endless loop.

        }
    }
    public static void nestedForLoop() {
        for (int row=0; row<=10; row++){
            System.out.println("This is row number: " +row);
            for (int column=0; column<=5; column++){
                System.out.println("This is column number: " +column);
            }
        }
//        // Outer loop
//        System.out.println(" ");
//        for (int i = 0; i <= 2; i++){
//            System.out.println("Outer loop: " + i);
//            // The "inner loop" will be executed one time for each iteration of the "Outer loop".
//            for (int j = 1; j <= 3; j++){
//                System.out.println("Inner loop: " +j);
//            }
//            for (int y = 1; y <=3; y++){
//                System.out.println("Second Inner loop: " + y);
//            }
//            for (int z = 1; z <=3; z++){
//                System.out.println("Third Inner loop: " + z);
//            }
//        }
    }
    public static void whileLoop(){

        // We us it when we don’t know beforehand how many times is needed to repeat the instructions.
        // The provided condition is checked before each repetition.
        // As long as this condition is true, the instructions keep repeating.
        int i=5;
        while (i<10){
            // i++; // at the end i becomes 10 and will print 6,8 and 10
            System.out.println(i);
            i++; // Without incrementation (i++), we will be in endless loop.
        }
    }
    public static void doWhile(){
        int i=5;
        do {
            i++;
            System.out.println(i); //The loop executes only once because the condition (i > 10) is false after the first iteration.
            i++;
        }while (i>10);
    }
    public static void forEachLoop(){
        int[] i={2,45,24,65};
        for (int item: i){
            System.out.println(item);
            if (item != 24){
                System.out.println("This is my number: " +item);
            }
        }
        String[] names = {"Eli", "Vidko", "Misho", "Vasko", "Plamka", "Edi", "Slav"};
        for (String name: names){
            System.out.println("My name is: " +name);
            if (name.equals("Slav")){
                System.out.println(name + " Krasimirov" + " Lazarov");
            }
        }
    }
    public static void continueStatement(){
        for (int i=7; i<10; i++){
            System.out.println("Number is: "+ i);
            System.out.println("This code is show always");
            if (i>7){
                System.out.println("Number is bigger than 7");
                continue;
            }
            if (i<=10){
                System.out.println("Number is less or = to 10");
            }
            System.out.println("Number is less or = to 8");
        }
        System.out.println("Next is WhileLoop");
        int y = 5;
        while (y<11){
            y++;
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y<7){
                System.out.println("Number is less to 7");
                continue;
            }
            if (y>9){
                System.out.println("Number is bigger than 9");
                continue;
            }
            System.out.println("Number is = to 7 or 8 or 9");
    }
    }
    public static void breakStatementWhileLoop(){
        int y = 5;
        while (y<11){
            y++;
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y==7){
                System.out.println("Number is == to 7");
                break; // With we are out of the code
            }
            if (y<9){
                System.out.println("Number is less than 9");
            }
        }
        System.out.println("End code");
    }
    public static void breakStatementDoWhileLoop() {
        int y = 5;
        do {
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y==7){
                System.out.println("Number is == to 7");
                break; // When 7 is reached code ends.
            }
            if (y<9){
                System.out.println("Number is less than 9");
            }
            y++;
        }while (y<11);
        System.out.println("End code");
    }



}