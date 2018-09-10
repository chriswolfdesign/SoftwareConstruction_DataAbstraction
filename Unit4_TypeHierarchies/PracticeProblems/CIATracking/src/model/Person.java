package model;

public class Person {
    private String name;
    private FingerPrint print;

    public Person(String name) {
        this.name = name;
        this.print = null;
    }

    public void setPrint(FingerPrint print) {
        this.print = print;
    }

    public String getName() {
        return this.name;
    }

    // EFFECTS: (pretends to) begin tracing the suspect in question
    public void track() {
        if(print == null)
            System.out.println("Tracking..." + name + " cannot be tracked.");
        else
            System.out.println("Tracking..." + name + " found in " + print.getLocation());
    }
}
