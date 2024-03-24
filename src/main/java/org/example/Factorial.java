package org.example;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int f) {
        if (f <= 0) {
            throw new IllegalArgumentException ("Число должно быть положительным");
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}

