// Accidentally we added "2" and "false" to the list.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the lines
// Create a method called sweets() which takes the list as a parameter.

// Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"



import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }
    public static List<Object> sweets(List<Object> x) {
        x.set(1, "Croissant");
        x.set(3, "Ice cream");
        return x;
    }
}