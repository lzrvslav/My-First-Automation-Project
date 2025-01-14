package Lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lecture6 {
    public static void main(String[] args){
        //arrayDemo();
        multiDimensionalArrayDemo();
        //arraylistDemo();
        //outSideOfBoundErrorDemo();
        //linkedListDemo();
        //queueDemo();
        //stackDemo();

    }
    public static void arrayDemo() {
        int[] numberArray = new int[6]; // Not predefined array with [6] EMPTY elements.
        int[] arrayNumbers ={5, 6, 3, 27, 7}; //Predefined array with defined 5 elements.
        System.out.println("Array length 1: " +numberArray.length); // Prints the elements in the array
        System.out.println("Array length 2: " +arrayNumbers.length); // Prints the elements in the array

        // Array 1 - Empty 'numberArray'
        System.out.println("Empty array:");
        for (int number : numberArray) {
            System.out.println("Array 1 current number is: " + number);
        }
        //  Array 1 - 'numberArray' with values.
        System.out.println("Array with values:");
        numberArray[0] = 6; // Add a value to index[0] to numberArray
        numberArray[1] = 5; // Add a value to index[1] to numberArray
        numberArray[2] = 4; // Add a value to index[2] to numberArray
        numberArray[3] = 3; // Add a value to index[3] to numberArray
        numberArray[4] = 2; // Add a value to index[4] to numberArray
        numberArray[5] = 1; // Add a value to index[5] to numberArray
        // numberArray[6] = 0; // Add a value to index[6] // When we do a not allowed action with an array. Something that is outside its index
        for (int number : numberArray) {
            System.out.println("Array 1 current number is: " + number);
        }

//        System.out.println("String array 1:");
//        String[] stringArray = new String[3];
//        for (String text:stringArray){
//            System.out.println("Elements of String array : " + text); // It prints null
//        }
//        stringArray[1] = "test text"; // Add a value to index[1] to stringArray[1]
//        System.out.println("String array 2:");
//        for (String text:stringArray){
//            System.out.println("Elements of String array : " + text); // It prints null
//        }
    }
    public static void multiDimensionalArrayDemo(){
        int[][] multiArray = {
                {3,1, 15, 6},
                {20,60, 70, 9},
                {236,4, 18, 11}
        };
        for (int row=0; row<multiArray.length; row++){
            // Access each element: multiArray[row][column]
            for (int column=0; column<multiArray[row].length; column++){
                System.out.println("Value of row "+row+" and culm "+column+" is: "+multiArray[row][column]);
            }
        }
        System.out.println("Custom value out of dim array with row 1 and column 2 is: "+multiArray[1][2]);
        System.out.println("Custom value out of dim array with row 1 and column 3 is: "+multiArray[1][3]);
    }
    public static void arraylistDemo(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Add elements
        arrayList.add(34);
        arrayList.add(36);
        arrayList.add(35);
        System.out.println("ArrayList values: "+arrayList);
        // Sort elements
        arrayList.sort(Integer::compareTo);
        System.out.println("ArrayList sorted values: "+arrayList);
        // Remove element
        arrayList.remove(1);
        System.out.println("ArrayList after remove element on index 1: "+arrayList);
        // Update element value
        arrayList.set(1, 96);
        System.out.println("ArrayList after set element on index 1: "+arrayList);
        // Check size
        arrayList.add(56);
        arrayList.add(2365);
        arrayList.add(2);
        System.out.println("ArrayList size is: "+arrayList.size());
        // Access element
        System.out.println("ArrayList value on index 3: "+arrayList.get(3));
        // Outside of bound -> error not allowed operation
        //System.out.println("ArrayList value on index 5: "+arrayList.get(5));
        for (int number:arrayList){
            System.out.println("Current number is: "+number);
        }
    }
    public static void outSideOfBoundErrorDemo() {
        int[] numbers = {4, 3, 6};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(9);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }
        for (int i = 0; i <= arrayList.size(); i++) {
            System.out.println("Number: " + arrayList.get(i));
        }
    }
    public static void linkedListDemo() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(235);
        linkedList.add(23);
        System.out.println(linkedList);
        //add on specific position
        linkedList.add(1, 543);
        System.out.println(linkedList);
        //add last element
        linkedList.addLast(3542);
        System.out.println(linkedList);
        //Add first element
        linkedList.addFirst(3);
        System.out.println(linkedList);
        //remove element
        linkedList.remove();
        System.out.println(linkedList);
        //remove element on index
        linkedList.remove(1);
        System.out.println(linkedList);
    }
    public static void queueDemo() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(35);
        queue.add(65);
        queue.add(8798);
        queue.add(96);
        // What elements we have in the queue
        System.out.println(queue);
        // Print numbers of element in total.
        System.out.println("Numbers of elements: " + queue.size());
        // Remove of element
        queue.remove();
        System.out.println(queue);

        int numberOfElementsInQueue = queue.size();
        for (int i = 0; i < numberOfElementsInQueue; i++) {
            System.out.println("Remove element: " + queue.poll());
            System.out.println(queue);
        }
        System.out.println(queue);
    }
    public static void stackDemo(){
        Stack<String> stringStack = new Stack<>();
        // Add elements in the stack
        stringStack.push("Book 1");
        stringStack.push("Book 2");
        stringStack.push("Book 3");
        stringStack.push("Book 4");
        // It prints all the elements in the stack
        System.out.println("Elements in stack: "+ stringStack);
        // Does not remove the element. We get information about the element
        System.out.println("Get first element: "+ stringStack.getFirst());
        System.out.println("Elements in stack: "+ stringStack);
        // Does not remove the element. We get information about the element
        System.out.println("Get last element: "+ stringStack.getLast());
        System.out.println("Elements in stack: "+ stringStack);
        // It removes the last element (LIFO order)
        System.out.println("Remove element: "+stringStack.pop());
        System.out.println("Elements in stack: "+ stringStack);
        // It removes element on preferred index. In Queue is not allowed.
        System.out.println("Remove element: "+stringStack.remove(1));
        System.out.println("Elements in stack: "+ stringStack);
    }
}
