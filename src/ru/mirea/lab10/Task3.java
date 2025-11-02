package ru.mirea.lab10;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        // Создаем первый список студентов
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("Иван", "Петров", "Информатика", 2, "ИС-21", 4.5));
        list1.add(new Student("Мария", "Иванова", "Математика", 3, "МТ-31", 4.8));
        list1.add(new Student("Алексей", "Сидоров", "Физика", 2, "ФЗ-22", 4.2));

        // Создаем второй список студентов
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Ольга", "Кузнецова", "Информатика", 1, "ИС-11", 4.7));
        list2.add(new Student("Дмитрий", "Васильев", "Математика", 2, "МТ-21", 4.1));
        list2.add(new Student("Елена", "Попова", "Физика", 3, "ФЗ-31", 4.9));

        System.out.println("Первый список:");
        printStudents(list1);

        System.out.println("\nВторой список:");
        printStudents(list2);

        // Объединяем два списка в один
        ArrayList<Student> mergedList = mergeStudentLists(list1, list2);

        System.out.println("\nОбъединенный список (до сортировки):");
        printStudents(mergedList);

        // Сортируем объединенный список по GPA (убыванию)
        sortStudentsByGPA(mergedList);

        System.out.println("\nОбъединенный список (после сортировки по GPA):");
        printStudents(mergedList);

        // Сортируем по имени
        sortStudentsByName(mergedList);

        System.out.println("\nОбъединенный список (после сортировки по имени):");
        printStudents(mergedList);
    }

    // Метод для объединения двух списков
    public static ArrayList<Student> mergeStudentLists(ArrayList<Student> list1, ArrayList<Student> list2) {
        ArrayList<Student> merged = new ArrayList<>();
        merged.addAll(list1);  // Добавляем все элементы из первого списка
        merged.addAll(list2);  // Добавляем все элементы из второго списка
        return merged;
    }

    // Метод для сортировки по GPA (убывающий порядок)
    public static void sortStudentsByGPA(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa()); // убывающий порядок
            }
        });
    }

    // Метод для сортировки по фамилии и имени
    public static void sortStudentsByName(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Сначала сравниваем по фамилии
                int lastNameCompare = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameCompare != 0) {
                    return lastNameCompare;
                }
                // Если фамилии одинаковые, сравниваем по имени
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });
    }

    // Метод для вывода списка студентов
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

