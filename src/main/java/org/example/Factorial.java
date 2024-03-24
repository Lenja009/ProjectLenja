package org.example;

/**
 * Hello world!
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    public static int calculateFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
