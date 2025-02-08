package Lecture13.Exercises;

public class Child extends Person{

    public Child(String EGN, String sex, String name, String religion, String languageSpoken, String nationality, String countryOfResidence) {
        super(EGN, sex, name, religion, languageSpoken, null, nationality, countryOfResidence);
    }

    @Override
    public void isAdult(){
        System.out.println(getName() + " is a child and not an adult.");
    }

    @Override
    public boolean canTakeLoan() {
        return false;
    }

    public void play() {
        System.out.println(getName() + " is building a spaceship out of LEGO bricks.");
    }
}
