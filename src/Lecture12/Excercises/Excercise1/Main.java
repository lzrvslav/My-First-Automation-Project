package Lecture12.Excercises.Excercise1;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

    }
}
