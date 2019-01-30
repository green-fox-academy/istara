package counter;

public class Counter {
    int counter = 0;
    int number;

    public int add(int number) {
        counter = counter + number;
        return counter;
    }

    public int add() {
        counter = counter + 1;
        return counter;
    }

    public void get() {
        System.out.println(counter);
    }

    public int reset() {
        counter = 0;
        return counter;
    }
}