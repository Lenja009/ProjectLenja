package lessons2;

public class Lesson_2 {
    public static void main(String[] agrs) {
        checkSumSign();
        printThreeWords();
        printColor();
        compareNumbers();
    }

    //первое задание
    static void printThreeWords() {
        System.out.print("Orange\n");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //второе задание
     static void checkSumSign() {
        int a = 5;
        int b = 1;
        if (a+b >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    //третье задание
    static void printColor() {
        int value = 27;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //четвертое задание
    static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }  else if (a < b) {
            System.out.println("a < b");
        }
    }
}


