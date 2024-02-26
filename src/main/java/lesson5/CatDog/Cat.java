package lesson5.CatDog;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        Cat.catCount++;
    }

    static void getCount() {
        System.out.println("создано котов:" + catCount);
    }

    void run(int length) {
        if (length <= 200 && length > 0) {
            super.run(length);
        } else if (length < 0) {
            System.out.println(super.getName() + " не может бежать назад");
        } else if (length == 0) {
            System.out.println(super.getName() + " стоит на месте");
        } else {
            System.out.println(super.getName() + " не может бежать далеко");
        }
    }

    void swim() {
        System.out.println(super.getName() + " не умеет плавать");
    }

    void eat(Plate plate, int foodAmount) {
        if (!satiety && plate.getFoodAmount() - foodAmount < 0) {
            System.out.println(super.getName() + " не может поесть, недостаточно еды");
        } else if (!satiety) {
            plate.setFoodAmount(plate.getFoodAmount() - foodAmount);
            satiety = true;
            System.out.println(super.getName() + " насытился и отдыхает");
        } else {
            System.out.println(super.getName() + " сыт");
        }
    }
}