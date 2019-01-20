import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8


        int result = 8;
        int guess = 0;

        while(result != guess) {
            System.out.println("Guess my number:");
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();


            if (guess < result) {
                System.out.println("The stored number is higher");
            } else if (guess > result) {
                System.out.println("The stried number is lower");
            } else {
                System.out.println("You found the number: " + result);
            }
        }
    }
}
