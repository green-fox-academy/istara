package main.java.animals;

public class Bird extends Animal implements Flyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breedType = "laying eggs.";
        return breedType;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeoff() {

    }
}