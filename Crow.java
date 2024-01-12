package io.animal.poultry;

public class Crow extends Chicken {

    public Crow(String name) {
        super(name);
    }

    public String name() {
        return this.name;
    }

    public String feed() {
        return "worms";
    }

    public void fly() {
        System.out.println("i can fly!");
    }
}
