package io.animal.poultry;

public class Chicken extends Poultry {

    public Chicken(String name) {
        super(name);
    }

    public String name() {
        return this.name;
    }

    public String feed() {
        return "corn";
    }

    public void fly() {
        System.out.println("I can't fly!");
    }
}
