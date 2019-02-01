// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(bunnyResult(5));
    }
    public static int bunnyResult(int n) {
        int oddEars = 2;
        int evenEars = 3;
        int totalEars = 0;
        if (n > 0) {
            if (n % 2 == 1) {
                totalEars = oddEars + bunnyResult(n - 1);
            } else {
                totalEars = evenEars + bunnyResult(n - 1);
            }
        }
        return totalEars;
    }
}