// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.

// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"



import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        putSaturn(planetList);

        System.out.println(putSaturn(planetList));
    }
    public static ArrayList<String> putSaturn(ArrayList<String> x){
        x.add(5, "Saturn");
        return x;
    }
}