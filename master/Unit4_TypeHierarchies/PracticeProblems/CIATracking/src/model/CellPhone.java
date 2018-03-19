package model;

import java.util.ArrayList;
import java.util.List;

public class CellPhone implements Traceable {

    private String location;
    private List<Call> calls;
    private Person owner;

    public CellPhone(String location, Person owner) {
        this.location = location;
        calls = new ArrayList<Call>();
        this.owner = owner;
    }

    // EFFECTS: returns a String describing the location of the person,
    //          or the police station where the fingerprints are being held
    @Override
    public String getLocation() {
        return this.location;
    }

    // EFFECTS: Returns all of the calls this phone has made
    public List<Call> getCalls() {
        return this.calls;
    }

    // EFFECTS: returns an object to help police officers find suspect
    //          ex. the cell phone, or the person with the fingerprint
    @Override
    public Object getTrace() {
        return this;
    }

    // EFFECTS: (pretends to) begin tracing the suspect in question
    @Override
    public void track() {
        System.out.println("Tracking...phone found in " + getLocation());
    }

    // MODIFIES: this
    // EFFECTS: adds a phone call to this cell phone's call Log
    public void addCall(Call call) {
        this.calls.add(call);
    }
}
