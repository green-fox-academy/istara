import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        System.out.println("Enter a number and i tell you if it's even or odd:");
        Scanner num = new Scanner(System.in);
        int ooe = num.nextInt();

        String result;
        if ( ooe % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.println("Your number is: " + result + ".");

    }
}
