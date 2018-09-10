package model;

public class Call implements Traceable {
    private String location;
    private CellPhone phone;

    public Call(String location, CellPhone phone) {
        this.location = location;
        this.phone = phone;
        phone.addCall(this);
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
        return this.phone;
    }

    // EFFECTS: (pretends to) begin tracing the suspect in question
    @Override
    public void track() {
        System.out.println("Tracking..." + "call made in " + phone.getLocation());
    }
}
