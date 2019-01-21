//  Create the usual class wrapper
//  and main method on your own.
// - Write a function called `sum` that sum all the numbers
//  e until the given parameter and returns with an intger


import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        System.out.println("Enter number to sum all natural number until your parameter: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(sum(x));
    }
    public static int sum(int ret) {
        int result = 0;
        for (int i = 0; i < ret; i++) {
            result += i;
        }
        return result;
    }
}