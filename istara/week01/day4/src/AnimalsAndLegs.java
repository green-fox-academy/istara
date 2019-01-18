import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the number of your chicken:");
        int chicken = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the number of your pigs:");
        int pigs = input2.nextInt();

        int totalLegs = chicken * 2 + pigs * 4;
        System.out.println(totalLegs);
    }
}