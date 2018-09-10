package model;

public abstract class Vegetable implements Growable {
    private String name;
    private VegType type;
    private String instructions;

    public Vegetable(String name, VegType type) {
        this.name = name;
        this.type = type;
        this.instructions = "No special instructions.";
    }

    // GETTERS
    public String getName() {
        return this.name;
    }
    public VegType getType() {
        return this.type;
    }
    @Override
    public String getInstructions() {
        return this.instructions;
    }

    // SETTERS
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
