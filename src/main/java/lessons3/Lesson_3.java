package lessons3;

public class Lesson_3 {
    public static void main(String[] agrs) {
        checkSum(15, 20);
        checkSignOfDigit(-7);
        digital(10);
        numString(2, "hello");
        seasons(2024);
        revertArray(replaceValues);
        exercise(100);
        arrays(multiplyOn2);
        level();
        createArray(10, 3);

    }

    static int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    static int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    //первое задание
    public static boolean checkSum(int x, int y) {
        int sum = x + y;
        boolean result = sum >= 10 && sum <= 20;
        System.out.println(result);
        return result;
    }

    //второе задание
    public static void checkSignOfDigit(int x) {
        if (x >= 0) {
            System.out.println("положиетльное число");
        } else {
            System.out.println("отрицательное число");
        }

    }

    //третье задание
    public static boolean digital(int x) {
        return (x <= 0);
    }

    //четвертое задание
    public static void numString(int salaryOne, String letters) {
        for (int i = 0; i < salaryOne; i++) {
            System.out.println(letters);
        }
    }

    // пятое задание
    public static boolean seasons(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println("Is " + year + " a leap year?: " + leapYear);
        return leapYear;
    }

    //шестое задание
    public static void revertArray(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0) ? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
        System.out.println("revertArray : ");
    }

    //седьмое задание
    public static void exercise(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    //восьмое задание
    public static void arrays(int[] multiplyOn2) {
        for (int i = 0; i < multiplyOn2.length; i++) {
            if (multiplyOn2[i] < 6) {
                multiplyOn2[i] = multiplyOn2[i] * 2;
            }
            System.out.print(multiplyOn2[i] + " ");
        }
    }

    //девятое задание
    public static void level() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    //десятое задание
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        return arr;
    }
}






