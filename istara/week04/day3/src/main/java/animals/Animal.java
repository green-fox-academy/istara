package main.java.animals;

public abstract class Animal {
    protected String  name, gender, type, color;
    protected int age, height, weight;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();
}