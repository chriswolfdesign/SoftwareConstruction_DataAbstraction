package model;

public class Date {

    private Month month;
    private int day;
    private int year;

    public Date(Month month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // EFFECTS: Returns a String based representation of the month
    public String getFormattedMonth() {
        switch(this.month) {
            case JANUARY:
                return "January";
            case FEBRUARY:
                return "February";
            case MARCH:
                return "March";
            case APRIL:
                return "April";
            case MAY:
                return "May";
            case JUNE:
                return "June";
            case JULY:
                return "July";
            case AUGUST:
                return "August";
            case SEPTEMBER:
                return "September";
            case OCTOBER:
                return "October";
            case NOVEMBER:
                return "November";
            default:
                return "December";
        }
    }

    // EFFECTS: Returns a String formatted of the date
    public String getFormattedDay() {
        if(this.day == 1 || this.day == 21)
            return this.day + "st";
        else if(this.day == 2 || this.day == 22)
            return this.day + "nd";
        else if(this.day == 3 || this.day == 23)
            return this.day + "rd";
        else
            return this.day + "th";
    }

    public String getFormattedDate() {
        return getFormattedMonth() + " " + getFormattedDay() + ", " + this.year;
    }
}
