/*
package ru.mirea.lab9;
import java.util.Comparator;

class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // сравниваем по убыванию GPA
        return Double.compare(s2.gpa, s1.gpa);
    }
}

public class Task2 {
    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            // разделяем массив
            int pivotIndex = partition(students, low, high, comp);
            // рекурсивно сортируем части
            quickSort(students, low, pivotIndex - 1, comp);
            quickSort(students, pivotIndex + 1, high, comp);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comp) {
        Student pivot = students[high];  // опорный элемент
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comp.compare(students[j], pivot) > 0) {
                i++;
                // меняем местами
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // ставим pivot на правильное место
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Иван", 4.2),
                new Student(2, "Мария", 4.8),
                new Student(3, "Петр", 3.9),
                new Student(4, "Анна", 4.5),
                new Student(5, "Сергей", 3.7)
        };

        System.out.println("До сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Сортируем по GPA (убывание) с встроенным компаратором
        Comparator<Student> comp = new GPAComparator();
        quickSort(students, 0, students.length - 1, comp);

        System.out.println("\nПосле сортировки по GPA (убывание):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}*/
