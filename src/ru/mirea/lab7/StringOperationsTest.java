package ru.mirea.lab7;

public class StringOperationsTest {
    public static void main(String[] args) {
        ProcessStrings editor = new ProcessStrings();

        String[] strings = {
                "hello world!",
                "string operation task",
                "1234567890"
        };

        for (String str : strings) {
            System.out.println("Строка: " + str + "\n");
            System.out.println("Длина: " + editor.countCharacters(str) + "\n");
            System.out.println("Нечетные позиции: " + editor.getOddPositionCharacters(str) + "\n");
            System.out.println("Реверс: " + editor.reverseString(str) + "\n");

        }
    }
}