package theGardenApplication;

public class Plant {
    public String color;
    private double currentWaterAmount = 0;
    private double waterAbsorption;
    private int waterNeed;

    public Plant(String color, double waterAbsorption, int waterNeed) {
        this.color = color;
        this.waterAbsorption = waterAbsorption;
        this.waterNeed = waterNeed;
    }

    public void addWater(int waterAmount) {
        this.currentWaterAmount += waterAbsorption * waterAmount;
    }

    public boolean isThirsty() {
        return currentWaterAmount < waterNeed;
    }

    public void  showStatus() {
        String needsWater = "";
        if (isThirsty()) {
            needsWater = " needs water.";
        } else {
            needsWater = " does not need water.";
        }

        String message = "The " + color + " " + this.getClass().getSimpleName() + needsWater;

        System.out.println(message);
    }
}