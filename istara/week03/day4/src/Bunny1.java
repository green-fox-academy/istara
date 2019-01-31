// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(bunnyNum(5));
    }

    public static int bunnyNum(int n) {
        int earNum = 0;
        if (n == 0) {
            return 0;
        } else {
            earNum = earNum + bunnyNum(n - 1) + 2;
        }
        return earNum;
    }
}