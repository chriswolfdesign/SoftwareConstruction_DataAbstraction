package model;

public class FingerPrint implements Traceable {
    private String location;
    private Person person;

    public FingerPrint(String location, Person person) {
        this.location = location;
        this.person = person;
        this.person.setPrint(this);
    }

    // EFFECTS: returns a String describing the location of the person,
    //          or the police station where the fingerprints are being held
    @Override
    public String getLocation() {
        return this.location;
    }

    // EFFECTS: returns an object to help police officers find suspect
    //          ex. the cell phone, or the person with the fingerprint
    @Override
    public Object getTrace() {
        return this.person;
    }

    // EFFECTS: (pretends to) begin tracing the suspect in question
    @Override
    public void track() {
        System.out.println("Tracking...fingerprint found in " + getLocation() + " police station.");
    }
}
