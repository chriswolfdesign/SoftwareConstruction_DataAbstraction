package model;

public class Reminder extends Entry {
    private String note;

    public Reminder(Date date, Time time, String label, boolean repeating) {
        super(date, time, label, repeating);
        this.note = "No note";
    }

    // GETTERS
    public String getNote() {
        return this.note;
    }

    // SETTERS
    public void setNote(String note) {
        this.note = note;
    }
}
