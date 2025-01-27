package Lecture9.Excercises.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Student student1 = new Student("Student 1", 10, 9, 7);
        Student student2 = new Student("Student 2", 10, 8, 7);

        System.out.println("--------------------------------------------");
        student1.printInfo();
        System.out.println("--------------------------------------------");
        student2.printInfo();
        System.out.println("--------------------------------------------");
    }

}