package ru.mirea.lab9;

public class Task3 {
    // Сортировка слиянием
    public static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; i++) {
            leftArray[i] = students[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = students[mid + 1 + j];
        }

        // Сливаем временные массивы
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                students[k] = leftArray[i];
                i++;
            } else {
                students[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы
        while (i < n1) {
            students[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            students[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Объединение двух отсортированных списков
    public static Student[] mergeLists(Student[] list1, Student[] list2) {
        // Сначала сортируем оба списка
        mergeSort(list1, 0, list1.length - 1);
        mergeSort(list2, 0, list2.length - 1);

        Student[] result = new Student[list1.length + list2.length];

        int i = 0, j = 0, k = 0;

        // Сливаем два отсортированных массива
        while (i < list1.length && j < list2.length) {
            if (list1[i].compareTo(list2[j]) <= 0) {
                result[k] = list1[i];
                i++;
            } else {
                result[k] = list2[j];
                j++;
            }
            k++;
        }

        // Добавляем оставшиеся элементы
        while (i < list1.length) {
            result[k] = list1[i];
            i++;
            k++;
        }

        while (j < list2.length) {
            result[k] = list2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        Student[] list1 = {
                new Student(3, "Иван", 4.2),
                new Student(1, "Мария", 4.8),
                new Student(5, "Петр", 3.9)
        };

        Student[] list2 = {
                new Student(2, "Анна", 4.5),
                new Student(4, "Сергей", 3.7),
                new Student(6, "Ольга", 4.1)
        };

        System.out.println("Первый список:");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("\nВторой список:");
        for (Student student : list2) {
            System.out.println(student);
        }

        Student[] mergedList = mergeLists(list1, list2);

        System.out.println("\nОбъединенный отсортированный список:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
