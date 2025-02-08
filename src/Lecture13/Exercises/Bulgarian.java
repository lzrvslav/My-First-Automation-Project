package Lecture13.Exercises;

public class Bulgarian extends Person{

    public Bulgarian(String EGN, String sex, String name, String religion, String job, String countryOfResidence) {
        super(EGN, sex, name, religion, "Bulgarian", job, "Bulgarian", countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей");
    }

    public void celebrateLiberationDay() {
        System.out.println(getName() + " celebrates Liberation Day on March 3rd.");

    }
}
