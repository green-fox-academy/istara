package counter;

public class Counter {
    int counterVar = 0;
    int startValue;

    public Counter(int counter) {
        this.counterVar = counter;
        startValue = counter;
    }

    public Counter() {
        startValue = counterVar;
    }

    public int add(int num) {
        counterVar = counterVar + num;
        return counterVar;
    }

    public int add() {
        counterVar = counterVar + 1;
        return counterVar;
    }

    public int get() {
        return counterVar;
    }

    public void reset() {
        counterVar = startValue;
    }
}