package model;


import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private List<Animal> animalList;
    private Animal favourite;

    // TODO: follow the instructions on the webpage to implement this class

    public Zookeeper(String name, int age) {
        this.name = name;
        this.age = age;
        this.animalList = new ArrayList<Animal>();
        this.favourite = null;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public List<Animal> getAnimalList() {
        return this.animalList;
    }
    public Animal getFavourite() {
        return this.favourite;
    }

    // SETTERS
    public void setFavourite(Animal fave) {
        this.favourite = fave;
    }

    // MODIFIES: this
    // EFFECTS: adds an animal to our list
    public void addToList(Animal animal) {
        this.animalList.add(animal);
    }

    // MODIFIES: this
    // EFFECTS: removes animal from list and returns true if animal is in list
    //          returns false if animal is not in list
    public boolean removeFromList(Animal animal) {
        Animal remove = null;
        for(Animal a : this.animalList) {
            if(a.equals(animal)) {
                remove = a;
            }
        }
        if(remove != null) {
            this.animalList.remove(remove);
            return true;
        }

        return false;
    }

}