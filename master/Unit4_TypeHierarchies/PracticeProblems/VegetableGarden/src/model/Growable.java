package model;

public interface Growable {
    // EFFECTS: Feeds the Growable object nutrients it needs to grow big and strong
    void feed();

    // EFFECTS: Provides the Growable object with water
    void water();

    String getInstructions();

    // EFFECTS: Gathers the Growable object
    void harvest();
}
