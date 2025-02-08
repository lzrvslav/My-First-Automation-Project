package Lecture12.Excercises.Excercise2;

class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        salary += salary * (percent / 100);
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + getName() + ", Monthly Salary: " + salary;
    }
}



