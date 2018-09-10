package model;

public interface Traceable {

    // EFFECTS: returns a String describing the location of the person,
    //          or the police station where the fingerprints are being held
    String getLocation();

    // EFFECTS: returns an object to help police officers find suspect
    //          ex. the cell phone, or the person with the fingerprint
    Object getTrace();

    // EFFECTS: (pretends to) begin tracing the suspect in question
    void track();
}
