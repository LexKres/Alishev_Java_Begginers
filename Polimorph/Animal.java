package Polimorph;

public class Animal {
    protected String name;

    public Animal () {
        name = "Animal";
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
