import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Please enter the amount of Km you'd like to convert into miles:");

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        double miles = userInput * 0.621371192;

        System.out.println("The entered amount in miles is: " + miles + ".");
    }
}