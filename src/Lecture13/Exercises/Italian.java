package Lecture13.Exercises;

public class Italian extends Person {

    public Italian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfResidence) {
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao");
    }

    public void celebrateRepublicDay() {
        System.out.println(getName() + " celebrates Republic Day on June 2nd.");
    }
}
