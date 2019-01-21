// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`





public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;

        int eredmeny = doubling(baseNum);
        System.out.println(eredmeny);
    }

    public static int doubling(int doubleMe) {
        doubleMe = doubleMe * 2;

        return doubleMe;
    }
}