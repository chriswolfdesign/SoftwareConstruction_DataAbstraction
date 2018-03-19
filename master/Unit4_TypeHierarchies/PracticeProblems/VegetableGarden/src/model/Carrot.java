package model;

public class Carrot extends Vegetable {
    public Carrot() {
        super("Carrot", VegType.SEED);
        super.setInstructions("Plant seeds in rows 3-4 inches apart");
    }

    // EFFECTS: Feeds the Growable object nutrients it needs to grow big and strong
    @Override
    public void feed() {
        System.out.println("Providing carrot with sandy soil.");
    }

    // EFFECTS: Provides the Growable object with water
    @Override
    public void water() {
        System.out.println("A week has passed.  Adding one inch of water.");
    }

    // EFFECTS: Gathers the Growable object
    @Override
    public void harvest() {
        System.out.println("Carrots have reached 1/2 inch in diameter.  Harvesting...");
    }
}
