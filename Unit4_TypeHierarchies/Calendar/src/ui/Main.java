package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(Month.NOVEMBER, 16, 1990);
        Calendar cal = new Calendar(d, "chriswolfdesign@gmail.com");

        Time t = new Time(10, 30, true);
        Meeting m = new Meeting(d, t, "Faculty Meeting", false);
        cal.addEntry(m);

        Event e = new Event(d, t, "Birthday Party", false);
        cal.addEntry(e);

        Reminder remind = new Reminder(d, t, "Pay bills", true);
        cal.addEntry(remind);

        cal.printMeetings();
    }
}
