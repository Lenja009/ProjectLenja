package lesson5.CatDog;

public class AnimalApp {
    public static void main(String[] agrs) {
        Animal animal1 = new Animal("Животное ");

        Dog dogBobik = new Dog("Бобик");

        Cat catBarsik = new Cat("Барсик");
        Cat catYmka = new Cat("Умка");

        dogBobik.run(170);
        dogBobik.swim(10);
        catBarsik.run(27);
        catYmka.run(180);
        catBarsik.swim();
        catYmka.swim();

        Plate plate = new Plate();
        plate.addFood(15);

        Cat[] cats = new Cat[2];
        cats[0] = catBarsik;
        cats[1] = catYmka;

        for (Cat cat : cats) cat.eat (plate,8);
    }
}