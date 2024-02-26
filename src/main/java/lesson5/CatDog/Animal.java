package lesson5.CatDog;

public class Animal {
    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        Animal.animalCount++;
    }

    static void getCount() {
        System.out.println("Создано животных: " + animalCount);
    }

    String getName() {
        return name;
    }

    void run(int length) {
        System.out.println(name + " пробежал " + length + " м");
    }

    void swim(int length) {
        System.out.println(name + " проплыл " + length + " м");
    }
}

