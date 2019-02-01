// Create a recursive function called `refactorio`
// that returns it's input's factorial


public class Refactorio {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        int fact = n;
        if (n > 1) {
            fact = n * factorial(n - 1);
        }
        return fact;
    }


}
