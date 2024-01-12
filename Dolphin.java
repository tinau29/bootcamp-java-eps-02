package io.animal.fish;

public class Dolphin extends Fish {

    public Dolphin(String name) {
        super(name);
    }

    public String name() {
        return this.name;
    }

    public String feed() {
        return "fish";
    }

    public void swim() {
        System.out.println("i can swim!");
    }
}
