package main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breedType = "laying eggs.";
        return breedType;
    }
}