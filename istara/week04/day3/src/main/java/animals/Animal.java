package main.java.animals;

public abstract class Animal {
    protected String name, gender;
    protected int age, weight, height;

    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}