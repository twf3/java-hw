package ru.mirea.lab17;

import java.util.Scanner;

public class DoublyStudentGroupTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyStudentGroup group = new DoublyStudentGroup();
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Найти студента");
            System.out.println("4. Очистить группу");
            System.out.println("5. Проверить пустоту группы");
            System.out.println("6. Показать количество студентов");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    group.addStudent();
                    break;
                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    group.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Введите имя студента для поиска: ");
                    String nameToFind = scanner.nextLine();
                    group.findStudent(nameToFind);
                    break;
                case 4:
                    group.clearGroup();
                    break;
                case 5:
                    System.out.println("Группа " + (group.isEmpty() ? "пуста" : "не пуста"));
                    break;
                case 6:
                    System.out.println("Количество студентов: " + group.getSize());
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}