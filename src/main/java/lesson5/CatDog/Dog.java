package lesson5.CatDog;

public class Dog extends Animal{
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        Dog.dogCount++;
    }

    static void getCount() {
        System.out.println("Создано собак: " + dogCount);
    }

    void run(int length) {
        if (length <= 500 && length > 0) {
            super.run(length);
        } else if (length < 0) {
            System.out.println(super.getName() + " не может бежать назад");
        } else if (length == 0) {
            System.out.println(super.getName() + " стоит на месте");
        } else {
            System.out.println(super.getName() + " не может бежать так далеко");
        }
    }
    void swim(int length) {
        if (length <= 10 && length > 0) {
            super.swim(length);
        } else if (length < 0) {
            System.out.println(super.getName() + " не может плыть меньше");
        } else if (length == 0) {
            System.out.println(super.getName() + " не плывет");
        } else {
            System.out.println(super.getName() + " не может плыть больше");
        }
    }
}
