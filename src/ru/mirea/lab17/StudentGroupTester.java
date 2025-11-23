package ru.mirea.lab17;

import java.util.Scanner;

public class StudentGroupTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGroup group = new StudentGroup();

        while (true) {
            displayMenu();
            System.out.print("Выберите действие: ");
            int choice;
            choice = scanner.nextInt();
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
                    group.displayStudent(nameToFind);
                    break;

                case 4:
                    group.clearGroup();
                    break;

                case 5:
                    if (group.isEmpty()) {
                        System.out.println("Группа пуста");
                    } else {
                        System.out.println("В группе есть студенты");
                    }
                    break;

                case 6:
                    System.out.println("Текущее количество студентов в группе: " + group.getSize());
                    break;

                case 0:
                    System.out.println("Программа завершена");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            System.out.println();
        }
    }

    // метод для отображения меню
    private static void displayMenu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить студента");
        System.out.println("2. Удалить студента");
        System.out.println("3. Поиск студента");
        System.out.println("4. Очистить группу");
        System.out.println("5. Проверить пустоту группы");
        System.out.println("6. Показать количество студентов");
        System.out.println("0. Выход");
    }
}
