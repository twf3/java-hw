package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2Test {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(
                new Student("Иван", "Фамилия", "Искусственный интеллект", 2, "квбо-13-24", 4.5),
                new Student("Мария", "Иванова", "Математика", 3, "кксо-15-21", 4.8),
                new Student("Алексей", "Сидоров", "Анализ данных", 2, "бмсо-01-23", 4.2)
        ));

        ArrayList<Student> list2 = new ArrayList<>(Arrays.asList(
                new Student("Ольга", "Кузнецова", "Информатика", 1, "трсв-23-25", 4.7),
                new Student("Дмитрий", "Васильев", "Интеллектуальные системы", 2, "пупу-11-22", 4.1),
                new Student("Елена", "Попова", "Разработка", 3, "абвг-01-24", 4.9)
        ));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // объединяем
        ArrayList<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        sorter.setArray(mergedList);

        System.out.println("Исходный список:\n");
        sorter.outArray();

        System.out.println("\nСортировка по GPA (убывающая) - быстрая сортировка:\n");
        sorter.quickSort(sorter.new GPAComparator());
        sorter.outArray();

        System.out.println("\nСортировка по фамилии - сортировка слиянием:\n");
        sorter.mergeSort(sorter.new NameComparator());
        sorter.outArray();

        System.out.println("\nСортировка по нескольким критериям:\n");
        sorter.sortByMultipleCriteria();
        sorter.outArray();
    }
}
