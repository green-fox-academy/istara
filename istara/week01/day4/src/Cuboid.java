public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
    double a = 10;
    double b = 15;
    double c = 20;

    double surfaceArea = 2 * (a * b + a * c + b * c);
    System.out.println(surfaceArea);
    double volume = a * b * c;
    System.out.println(volume);
    }
}