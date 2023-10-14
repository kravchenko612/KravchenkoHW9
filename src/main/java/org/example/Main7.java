package org.example;

import java.util.Scanner;

//Завдання 7
//Користувач вводить з клавіатури будь-який рядок. Змініть у
//початковому рядку всі великі літери на маленькі, а маленькі —
//великими. Якщо в рядку є цифри, замініть їх на символи
//підкреслення, і виведіть результат у консоль.


public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок: ");
        String input = scanner.nextLine();

        // Змінити великі літери на маленькі і навпаки
        String reversedCase = reverseCase(input);

        // Замінити цифри на символи підкреслення
        String result = replaceDigitsWithUnderscore(reversedCase);

        System.out.println("Результат: " + result);
    }

    // Метод для зміни регістру літер у рядку
    private static String reverseCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Метод для заміни цифр на символи підкреслення
    private static String replaceDigitsWithUnderscore(String str) {
        return str.replaceAll("\\d", "_");
    }
}

