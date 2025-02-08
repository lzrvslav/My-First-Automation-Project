package Lecture13.Exercises;

public class American extends Person{

    public American(String EGN, String sex, String name, String religion, String job, String countryOfResidence) {
        super(EGN, sex, name, religion, "English", job, "American", countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public void celebrateIndependenceDay() {
        System.out.println(getName() + " celebrates Independence Day on July 4th.");
    }
}
