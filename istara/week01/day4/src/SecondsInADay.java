public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int remH = 24 - currentHours - 1;
        int remM = 60 - currentMinutes -1;
        int remS = 60 - currentSeconds;

        int rem = remH * 3600 + remM * 60 + remS;

        System.out.println(rem);
    }
}