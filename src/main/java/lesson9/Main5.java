package lesson9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        System.out.println("Введите логины. Нажмите, чтобы закончить \"Enter\"");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            logins.add(input);
        }

        System.out.println("Логины на букву f - " + logins.stream()
                .filter(o -> o.startsWith("f")).collect(Collectors.toList()));
    }
}
