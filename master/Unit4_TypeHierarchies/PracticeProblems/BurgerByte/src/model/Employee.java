package model;

public abstract class Employee {

    // fields
    public static double BASE_WAGE = 10.00;
    private double hoursWorked;
    private String name;
    private int age;
    private boolean atWork;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.atWork = false;
        this.hoursWorked = 0;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public boolean isAtWork() {
        return this.atWork;
    }

    // MODIFIES: this
    // EFFECTS: adds the given number of hours worked to total hours worked
    public void logHoursWorked(double hours) {
        this.atWork = true;
        hoursWorked += hours;
    }

    // MODIFIES: this
    // EFFECTS: Labels employee as at work and modifies fields as needed
    public void startWork(double hours) {
        atWork = true;
        this.logHoursWorked(hours);
    }

    // MODIFIES: this
    // EFFECTS Labels employee as not at work and modifies fields as needed
    public void leaveWork() {
        this.atWork = false;
    }

    // EFFECTS: Announces how much money the employee has made
    public abstract double computeWage();
}
