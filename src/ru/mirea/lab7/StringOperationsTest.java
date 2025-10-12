package ru.mirea.lab7;

public class StringOperationsTest {
    public static void main(String[] args) {
        ProcessStrings editor = new ProcessStrings();

        String[] strings = {
                "Hello World!",
                "Java Programming",
                "1234567890"
        };

        for (String str : strings) {
            System.out.println("\nСтрока: \"" + str + "\"");
            System.out.println("Длина: " + editor.countCharacters(str));
            System.out.println("Нечетные позиции: \"" + editor.getOddPositionCharacters(str) + "\"");
            System.out.println("Реверс: \"" + editor.reverseString(str) + "\"");

        }
    }
}