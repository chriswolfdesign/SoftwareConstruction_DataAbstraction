package model;

import java.util.ArrayList;

public class Meeting extends Event {
    private ArrayList<String> emailList;

    public Meeting(Date date, Time time, String label, boolean repeating) {
        super(date, time, label, repeating);
        this.emailList = new ArrayList<String>();
    }

    // GETTERS
    public ArrayList<String> getEmailList() {
        return this.emailList;
    }

    // MODIFIES: this
    // EFFECTS: Adds email to our email list
    public void addEmail(String email) {
        this.emailList.add(email);
    }

    // REQUIRES: email is currently in our list
    // MODIFIES: this
    // EFFECTS: Removes email from our email list
    public void removeEmail(String email) {
        this.emailList.remove(email);
    }

    // REQUIRES: emailList != null
    // EFFECTS: sends (fake) invitations to emailList
    public void sendInvitations() {
        for(String email : emailList) {
            System.out.println("Inviting: " + email);
        }
    }
}
