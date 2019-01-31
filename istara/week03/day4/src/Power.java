// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


public class Power {
    public static void main(String[] args) {
        int base = 5;
        int power = 10;
        System.out.println(power(base, power));
    }

    public static int power(int baseNum, int powerNum) {
        if (powerNum > 2) {
            return (baseNum * power(baseNum, powerNum - 1));
        } else {
            return 1;
        }
    }
}