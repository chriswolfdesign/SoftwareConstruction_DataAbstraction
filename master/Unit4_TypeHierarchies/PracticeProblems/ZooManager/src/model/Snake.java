package model;

public class Snake extends Animal {
    private double length;
    private boolean venom;

    public Snake(String nm, int age, Zookeeper zk, double wgt, double len, boolean vn) {
        super(nm, age, zk, wgt);
        this.length = len;
        venom = vn;
    }

    // getters
    public double getLength() {
        return this.length;
    }
    public boolean isVenom() { return venom; }


}