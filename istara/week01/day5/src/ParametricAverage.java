import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
            // Write a program that asks for a number.
            // It would ask this many times to enter an integer,
            // if all the integers are entered, it should print the sum and average of these
            // integers like:
            //
            // Sum: 22, Average: 4.4


        System.out.println("Enter how many numbers u want to add and get their average of:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int b = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Enter one of the numbers to calculate:");
            b += input.nextInt();
        }
        double c = b / a;
        System.out.println("Sum: " + b + ", Average: " + c);
    }
}