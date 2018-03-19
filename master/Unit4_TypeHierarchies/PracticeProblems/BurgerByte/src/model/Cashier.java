package model;

public class Cashier extends Employee {

    public static final double CASHIER_WAGE = 6.50;

    private BurgerByte workBranch;
    private boolean isRegisterOpen;

    public Cashier(String name, int age, BurgerByte workBranch) {
        super(name, age);
        this.workBranch = workBranch;
        isRegisterOpen = false;
        workBranch.getManager().hire(this);
    }

    // getters
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isRegisterOpen() { return isRegisterOpen; }

    // EFFECTS: sets isRegisterOpen to true, and updates atWork to reflect that this Cashier is
    //          now at work
    public void startWork(double hours) {
        isRegisterOpen = true;
        super.startWork(hours);
        System.out.println("Register open!");
    }

    // EFFECTS: sets isRegisterOpen to false and updates atWork to reflect that this Cashier is
    //          no longer at work
    public void leaveWork() {
        isRegisterOpen = false;
        super.leaveWork();
        System.out.println("Register closed, can't take any more orders.");

    }

    // EFFECTS: computes wages for the day
    public double computeWage() {
        return (this.getHoursWorked() * (CASHIER_WAGE + BASE_WAGE));
    }


}