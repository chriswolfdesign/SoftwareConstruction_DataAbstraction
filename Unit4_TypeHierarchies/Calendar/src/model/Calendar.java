package model;

import java.util.ArrayList;

public class Calendar {
    private Date date;
    private String email;
    private ArrayList<Entry> entries;

    public Calendar(Date date, String email) {
        this.date = date;
        this.email = email;
        this.entries = new ArrayList<Entry>();
    }

    // GETTERS
    public Date getDate() {
        return this.date;
    }
    public String getEmail() {
        return this.email;
    }
    public ArrayList<Entry> getUpcomingEvents() {
        return this.entries;
    }

    // SETTERS
    public void setDate(Date date) {
        this.date = date;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // MODIFIES: this
    // EFFECTS: Add an entry to our entries list
    public void addEntry(Entry entry) {
        this.entries.add(entry);
    }

    // MODIFIES: this
    // EFFECTS: Remove an entry from our entries list
    public void removeEntry(String meetingLabel) {
        Entry remove = null;
        for(Entry entry : this.entries) {
            if(entry.getLabel().equals(meetingLabel))
                remove = entry;
        }
        if(remove != null)
            this.entries.remove(remove);
    }

    // EFFECTS: returns true if any of the entries hold the given label
    //          false otherwise
    public boolean contains(String label) {
        for(Entry entry : this.entries) {
            if(entry.getLabel().equals(label))
                return true;
        }
        return false;
    }

    public void printMeetings() {
        System.out.println("Here are your upcoming meetings");
        for(Entry entry : this.entries) {
            if(entry instanceof Meeting)
                System.out.println(entry.getLabel());
        }
    }
}
