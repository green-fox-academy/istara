package main.java.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breedType = "pushing miniature versions out.";
        return breedType;
    }
}