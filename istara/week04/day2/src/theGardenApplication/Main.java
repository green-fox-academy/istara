package theGardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.showStatus();

        System.out.println("Watering with 40");
        garden.waterStuff(40);
        garden.showStatus();

        System.out.println("Watering with 70");
        garden.waterStuff(70);
        garden.showStatus();
    }
}