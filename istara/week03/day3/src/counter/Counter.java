package counter;

public class Counter {
    int counter = 0;
    int number;
    public int add(int number) {
        counter = counter + number;
    }
    public int add() {
        counter = counter + 1;
    }
    public int get() {
        System.out.println(counter);
    }
    public int reset() {
        counter = 0;
    }
}