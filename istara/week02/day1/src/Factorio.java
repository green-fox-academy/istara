// - Create a function called `factorio`
//   that returns it's input's factorial


import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        System.out.println("Enter a number to get it's factorial:");
        Scanner num = new Scanner(System.in);
        int inputNum = num.nextInt();
        System.out.println(factorio(inputNum));
    }
    public static int factorio(int x) {
        int result = 1;
        for (int i = 1; i <=x; i++) {
            result = result * i;
        }
        return result;
    }
}