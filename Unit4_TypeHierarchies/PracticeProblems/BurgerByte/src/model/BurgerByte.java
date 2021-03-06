package model;

import java.util.LinkedList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private List<Employee> employees;
    private boolean isOpen;

    public BurgerByte(String locn, Manager manager) {
        location = locn;
        this.manager = manager;
        this.manager.setManagingBranch(this);
        employees = new LinkedList<>();
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() { return employees; }
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : employees) {
            e.leaveWork();
        }
    }

    // REQUIRES: e must not be in this employees or this BurgerByte's Manager's employees
    // MODIFIES: this
    // EFFECTS: adds the given employee to this employees
    public void addStaff(Employee e) {
        employees.add(e);
    }

    // REQUIRES: e must be in this employees and this BurgerByte's Manager's employees
    // MODIFIES: this
    // EFFECTS: removes the given employee from this employees
    public void removeStaff(Employee e) {
        employees.remove(e);
    }

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    public void computeStaffWages() {
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }


}