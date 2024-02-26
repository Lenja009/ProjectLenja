package lesson5.CatDog;

public class Plate {
    private int foodAmount;

    public void addFood(int portion) {
        this.foodAmount += portion;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }
}
