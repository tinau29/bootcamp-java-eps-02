package io.animal.fish;

import io.animal.Animal;

public  abstract class Fish implements Animal {

    public String name;

    Fish(String name) {
        this.name = name;
    }

    public abstract  String name();

    public abstract  String feed();

    public abstract  void swim();
}
