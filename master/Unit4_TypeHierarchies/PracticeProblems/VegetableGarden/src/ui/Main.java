package ui;

import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList<Vegetable>();
        garden.add(new Lettuce());
        garden.add(new Tomato());
        garden.add(new Carrot());

        for(Vegetable vg : garden) {
            System.out.println("How to garden: " + vg.getName());
            System.out.println("Vegetable Type: " + vg.getType());
            vg.feed();
            vg.water();
            vg.harvest();
            System.out.println("Special instructions: " + vg.getInstructions());
            System.out.println();
        }
    }
}
