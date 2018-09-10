package model;

public class Tomato extends Vegetable {
    public Tomato() {
        super("Tomato", VegType.ROOT);
        super.setInstructions("Place rock near plant.");
    }

    // EFFECTS: Feeds the Growable object nutrients it needs to grow big and strong
    @Override
    public void feed() {
        System.out.println("Providing tomato with acidic, loamy soil.");
    }

    // EFFECTS: Provides the Growable object with water
    @Override
    public void water() {
        System.out.println("A week has passed.  Adding two inches of water.");
    }

    // EFFECTS: Gathers the Growable object
    @Override
    public void harvest() {
        System.out.println("Waiting to harvest as long as possible.");
    }
}
