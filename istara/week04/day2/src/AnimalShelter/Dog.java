package AnimalShelter;

public class Dog extends Animal {
    public Dog() {
        healCost = (int) (Math.random() * 8) + 1;
    }

    public Dog(String name) {
        this.name = name;
        healCost = (int) (Math.random() * 8) + 1;
    }
}