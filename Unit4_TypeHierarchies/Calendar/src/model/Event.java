package model;

public class Event extends Entry {

    private Reminder remind;

    public Event(Date date, Time time, String label, boolean repeating) {
        super(date, time, label, repeating);
    }

    // GETTERS
    public Reminder getReminder() {
        return this.remind;
    }

    // SETTERS
    public void setReminder(Reminder remind) {
        this.remind = remind;
    }
}
