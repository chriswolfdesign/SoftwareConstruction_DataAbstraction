package model;

public abstract class Animal {
    private String name;
    private int age;
    private Zookeeper careTaker;
    private double weight;

    public Animal(String nm, int age, Zookeeper zk, double wgt) {
        name = nm;
        this.age = age;
        careTaker = zk;
        weight = wgt;
        zk.addToList(this);
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public Zookeeper getCareTaker() { return careTaker; }
    public double getWeight() { return weight; }
}
