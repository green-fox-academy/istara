package main.java.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breedType = "laying eggs.";
        return breedType;
    }
}