package animal;

public class Animal {
    int hunger = 50;
    int thirst = 50;
    public int eat() {
        hunger = hunger - 1;
    }
    public int drink() {
        thirst = thirst - 1;
    }
    public int play() {
        hunger = hunger + 1;
        thirst = thirst + 1;
    }
}