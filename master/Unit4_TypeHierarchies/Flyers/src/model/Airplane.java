package model;

public class Airplane implements Flyer, Cafe {

    @Override
    public void serveDrinks() {
        System.out.println("Serving drinks");
    }

    @Override
    public void serveSnacks() {
        serveChips();
        servePeanuts();
    }

    private void serveChips() {
        System.out.println("Here are your chips!");
    }

    private void servePeanuts() {
        System.out.println("Here are your peanuts!");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off!!");
    }

    @Override
    public void fly() {
        System.out.println("Flying along -- no turbulance!");
    }

    @Override
    public void land() {
        System.out.println("Fasten your seatbelts -- landing!");
    }
}
