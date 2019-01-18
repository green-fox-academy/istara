import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Enter two numbers and I'll print which one is larger:");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(); int b = num.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
