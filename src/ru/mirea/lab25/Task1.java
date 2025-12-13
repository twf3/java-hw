package ru.mirea.lab25;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // пример  email  user123@example.ru
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        boolean running = true;

        while (running) {
            System.out.println("1 - Разбить строку на слова");
            System.out.println("2 - Найти все числа");
            System.out.println("3 - Найти email адреса");
            System.out.println("4 - Удалить лишние пробелы");
            System.out.println("5 - Проверить наличие дат в формате dd/mm/yyyy");
            System.out.println("6 - Ввести новую строку");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    splitIntoWords(input);
                    break;
                case 2:
                    findNumbers(input);
                    break;
                case 3:
                    findEmails(input);
                    break;
                case 4:
                    System.out.println(removeExtraSpaces(input));
                    break;
                case 5:
                    findDates(input);
                    break;
                case 6:
                    System.out.print("Введите новую строку: ");
                    input = scanner.nextLine();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        scanner.close();
    }

    public static void splitIntoWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                System.out.println(words[i]);
            }
        }
    }

    public static void findNumbers(String text) {
        String regex = "\\d+(\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean flag = false;
        while (matcher.find()) {
            System.out.println("Число: " + matcher.group());
            flag = true;
        }
        if (!flag) {
            System.out.println("Числа не найдены");
        }
    }

    public static void findEmails(String text) {
        String regex = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean flag = false;
        while (matcher.find()) {
            System.out.println("email: " + matcher.group());
            flag = true;
        }
        if (!flag) {
            System.out.println("Email адреса не найдены");
        }
    }

    public static String removeExtraSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void findDates(String text) {
        // dd/mm/yyyy
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2}|[2-9]\\d{3})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean flag = false;
        while (matcher.find()) {
            System.out.println("дата: " + matcher.group());
            flag = true;
        }
        if (!flag) {
            System.out.println("Даты в формате dd/mm/yyyy не найдены");
        }
    }
}