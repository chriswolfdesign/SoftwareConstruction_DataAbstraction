package model;

public interface Flyer {

    // REQUIRES: being on land
    // MODIFIES: this
    // EFFECTS: moves this into the air
    public void takeOff();

    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves horizontally through the air
    public void fly();

    // REQUIRES: being in the air
    // MODIFIES: this
    // EFFECTS: moves this onto land
    public void land();
}
