package Lecture13.Exercises;

public class Main {
    public static void main(String[] args) {
        Person Dido = new Person(
                "0510278086",
                "male",
                "Dido",
                "Hindo",
                "German",
                "IT",
                "Bulgarian",
                "Bulgaria");

        System.out.println("Print date of birth: " + Dido.getDateOfBirth());
        Dido.sayHello();
        Dido.celebrateEaster();
        Dido.isAdult();
        System.out.println("Can " + Dido.getName() + " take a loan: " + Dido.canTakeLoan());
        System.out.println("Sex: " +Dido.getSex());

        Child child = new Child(
                "1002171234",
                "male",
                "Georgi",
                "Orthodox",
                "Bulgarian",
                "Bulgarian",
                "Bulgaria");
        child.sayHello();
        child.isAdult();
        System.out.println("Can the child Georgi take a loan: " + child.canTakeLoan());
        System.out.println("Sex: " +child.getSex());
        child.play();

        Bulgarian bulgarian = new Bulgarian(
                "8001011234",
                "male",
                "Stefan",
                "Orthodox",
                "Seller",
                "Bulgaria");

        bulgarian.sayHello();
        bulgarian.celebrateEaster();
        bulgarian.isAdult();
        bulgarian.celebrateLiberationDay();
        System.out.println("Print date of birth: " + bulgarian.getDateOfBirth());

        American american = new American(
                "9007045678",
                "male",
                "John",
                "Buddhism",
                "Builder",
                "USA");
        american.sayHello();
        american.celebrateIndependenceDay();

        Italian italian = new Italian(
                "0209019012",
                "female",
                "Lorenzo",
                "Catholic",
                "Italian",
                "null",
                "Italian",
                "Bulgaria");

        System.out.println("---------------------------------------------");
        Person[] people = {Dido, child, bulgarian, american, italian};

        for (Person person : people) {
            System.out.println();
            person.getName();
            person.sayHello();
            person.getReligion();
        }
        System.out.println("---------------------------------------------");
    }
}