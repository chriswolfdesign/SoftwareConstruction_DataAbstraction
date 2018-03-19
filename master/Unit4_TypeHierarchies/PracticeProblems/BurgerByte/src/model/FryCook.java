package model;

public class FryCook extends Employee {

    public static final double FRYCOOK_WAGE = 5.50;
    public static final double BASE_WAGE = 10.00;

    private String name;
    private int age;
    private BurgerByte workBranch;
    private boolean isGrillReady;

    public FryCook(String name, int age, BurgerByte workBranch) {
        super(name, age);
        this.workBranch = workBranch;
        isGrillReady = false;
        workBranch.getManager().hire(this);
    }

    // getters
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isGrillReady() { return isGrillReady; }

    // EFFECTS: the grill should be ready to go, hours should be logged, and
    //          the atWork field should be updated to reflect this FryCook's status
    public void startWork(double hours) {
        isGrillReady = true;
        super.startWork(hours);
        System.out.println("Grill is ready to cook with!");
    }

    // EFFECTS: close the grill for the day, and update this FryCook's work status
    public void leaveWork() {
        isGrillReady = false;
        super.leaveWork();
        System.out.println("Grill is closed for the day.");
    }

    // EFFECTS: computes wages for the day
    public double computeWage() {
        return (this.getHoursWorked() * (FRYCOOK_WAGE + BASE_WAGE));
    }


}