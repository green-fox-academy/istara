import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Please enter five numbers to add them and get the average of them:");

        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); int b = num.nextInt(); int c = num.nextInt(); int d = num.nextInt(); int e = num.nextInt();

        int add = a + b + c + d + e;
        int average = add / 5;

        System.out.println("Result of the addition: " + add + ". Average: " + average + ".");
    }
}
