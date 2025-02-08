package Lecture12.Excercises.Excercise2;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Slav", "Lazarov", 1000);

        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println(employee.toString());

    }
}
