package model;

public class Lettuce extends Vegetable {
    public Lettuce() {
        super("Lettuce", VegType.LEAF);
        super.setInstructions("Plant seeds in rows 12-15 inches across.");
    }

    // EFFECTS: Feeds the Growable object nutrients it needs to grow big and strong
    @Override
    public void feed() {
        System.out.println("Providing lettuce with loamy soil");
    }

    // EFFECTS: Provides the Growable object with water
    @Override
    public void water() {
        System.out.println("Leaves are wilting.  Watering...");
    }

    // EFFECTS: Gathers the Growable object
    @Override
    public void harvest() {
        System.out.println("Lettuce is nearing maturity.  Harvesting...");
    }
}
