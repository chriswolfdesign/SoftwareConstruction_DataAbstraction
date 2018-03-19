package model;

public class Time {

    private int hours;
    private int minutes;
    private boolean morning;

    public Time(int hours, int minutes, boolean morning) {
        this.hours = hours;
        this.minutes = minutes;
        this.morning = morning;
    }

    // EFFECTS: Returns our date in a formatted String
    public String getFormattedTime() {
        return this.hours + ":" + this.minutes + " " + getAMorPM();
    }

    // EFFECTS: returns AM or PM depending on the time of day
    public String getAMorPM() {
        if(this.morning)
            return "AM";
        else
            return "PM";
    }
}
