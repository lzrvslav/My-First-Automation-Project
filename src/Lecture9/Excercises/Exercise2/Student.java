package Lecture9.Excercises.Exercise2;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double average;

    public Student (String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.average = ((grade1 + grade2 + grade3) / 3);
    }

    public void printInfo(){
        System.out.println("Student details:");
        System.out.println("Student name: " + this.name);
        System.out.println("Student average grade is: " + this.average);
    }

}