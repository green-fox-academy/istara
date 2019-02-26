package AnimalShelter;

public class Parrot extends Animal {
    public Parrot() {
        healCost = (int) (Math.random() * 7) + 4;
    }

    public Parrot(String name) {
        this.name = name;
        healCost = (int) (Math.random() * 7) + 4;
    }
}