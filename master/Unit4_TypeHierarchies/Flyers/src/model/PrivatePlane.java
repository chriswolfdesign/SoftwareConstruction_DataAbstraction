package model;

public class PrivatePlane extends Airplane {

    // MODIFIES: this
    // EFFECTS: prints brought warm towels
    public void bringWarmTowels() {
        System.out.println("Here is your warm towel!");
    }

    @Override
    public void serveSnacks() {
        serveCaviar();
        serveCashews();
        super.serveSnacks();
    }

    private void serveCashews() {
        System.out.println("Here are your cashews!");
    }

    private void serveCaviar() {
        System.out.println("Here is your caviar!");
    }
}
