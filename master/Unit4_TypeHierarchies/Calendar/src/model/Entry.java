package model;

public abstract class Entry {
    private Date date;
    private Time time;
    private String label;
    private int interval;
    private boolean repeating;

    public Entry(Date date, Time time, String label, boolean repeating) {
        this.date = date;
        this.time = time;
        this.label = label;
        this.interval = 0;
        this.repeating = repeating;
    }

    // GETTERS
    public Date getDate() {
        return this.date;
    }
    public Time getTime() {
        return this.time;
    }
    public String getLabel() {
        return this.label;
    }
    public int getInterval() {
        return this.interval;
    }
    public boolean isRepeating() {
        return this.repeating;
    }

    // SETTERS
    public void setInterval(int interval) {
        this.interval = interval;
    }
    public void setLabel(String label) {
        this.label = label;
    }
}
