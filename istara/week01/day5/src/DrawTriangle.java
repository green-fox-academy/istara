import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        System.out.println("Enter number of rows: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int b = 1; b <= row; b++) {

            for (int a = 1; a <= row; a++) {
                if (a <= b) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}