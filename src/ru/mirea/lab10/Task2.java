package ru.mirea.lab10;

import java.util.*;

class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber;

    public SortingStudentsByGPA() {
        this.iDNumber = new ArrayList<>();
    }

    // 1) Метод заполнения массива
    public void setArray(ArrayList<Student> students) {
        this.iDNumber = new ArrayList<>(students);
    }

    // 2) Компаратор для сортировки по GPA (убывающий порядок)
    class GPAComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }

    // Компаратор для сортировки по имени
    class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.getLastName().compareTo(b.getLastName());
        }
    }

    // Компаратор для сортировки по курсу
    class CourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(a.getCourse(), b.getCourse());
        }
    }

    // БЫСТРАЯ СОРТИРОВКА с использованием компаратора
    public void quickSort(Comparator<Student> comparator) {
        quickSortHelper(0, iDNumber.size() - 1, comparator);
    }

    private void quickSortHelper(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            // Находим опорный элемент
            int pivotIndex = partition(low, high, comparator);

            // Рекурсивно сортируем элементы до и после опорного
            quickSortHelper(low, pivotIndex - 1, comparator);
            quickSortHelper(pivotIndex + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<Student> comparator) {
        // Берем последний элемент как опорный
        Student pivot = iDNumber.get(high);
        int i = low - 1; // индекс меньшего элемента

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (comparator.compare(iDNumber.get(j), pivot) <= 0) {
                i++;

                // Меняем местами элементы
                Student temp = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, temp);
            }
        }

        // Ставим опорный элемент на правильную позицию
        Student temp = iDNumber.get(i + 1);
        iDNumber.set(i + 1, iDNumber.get(high));
        iDNumber.set(high, temp);

        return i + 1;
    }

    // СОРТИРОВКА СЛИЯНИЕМ с использованием компаратора
    public void mergeSort(Comparator<Student> comparator) {
        if (iDNumber.size() > 1) {
            ArrayList<Student> sorted = mergeSortHelper(new ArrayList<>(iDNumber), comparator);
            iDNumber = sorted;
        }
    }

    private ArrayList<Student> mergeSortHelper(ArrayList<Student> list, Comparator<Student> comparator) {
        // Базовый случай рекурсии - массив из 1 элемента уже отсортирован
        if (list.size() <= 1) {
            return list;
        }

        // Находим середину массива
        int mid = list.size() / 2;

        // Делим массив на две части
        ArrayList<Student> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        // Рекурсивно сортируем обе части
        left = mergeSortHelper(left, comparator);
        right = mergeSortHelper(right, comparator);

        // Сливаем отсортированные части
        return merge(left, right, comparator);
    }

    private ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right, Comparator<Student> comparator) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        // Сравниваем элементы из двух массивов и добавляем меньший в результат
        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся элементы из левого массива
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        // Добавляем оставшиеся элементы из правого массива
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    // 3) Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // 4) Метод для сортировки по другому полю с цепочкой компараторов
    // 4) Метод для сортировки по другому полю с цепочкой компараторов
    public void sortByMultipleCriteria() {
        Collections.sort(iDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCourse() != s2.getCourse()) {
                    return s1.getCourse() - s2.getCourse();
                }
                if (s1.getGpa() != s2.getGpa()) {
                    return Double.compare(s2.getGpa(), s1.getGpa()); // убывающий порядок
                }
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
    }

    // Геттер для получения списка
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(iDNumber);
    }
}

public class Task2 {
    public static void main(String[] args) {
        // Создаем первый ArrayList студентов
        ArrayList<Student> list1 = new ArrayList<>(Arrays.asList(
                new Student("Иван", "Петров", "Информатика", 2, "ИС-21", 4.5),
                new Student("Мария", "Иванова", "Математика", 3, "МТ-31", 4.8),
                new Student("Алексей", "Сидоров", "Физика", 2, "ФЗ-22", 4.2)
        ));

        // Создаем второй ArrayList студентов
        ArrayList<Student> list2 = new ArrayList<>(Arrays.asList(
                new Student("Ольга", "Кузнецова", "Информатика", 1, "ИС-11", 4.7),
                new Student("Дмитрий", "Васильев", "Математика", 2, "МТ-21", 4.1),
                new Student("Елена", "Попова", "Физика", 3, "ФЗ-31", 4.9)
        ));

        // Создаем объект для сортировки
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Объединяем ArrayList'ы
        ArrayList<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("=== Объединенный список студентов ===");
        sorter.setArray(mergedList);
        sorter.outArray();

        System.out.println("\n=== Сортировка по GPA (убывающий) - быстрая сортировка ===");
        sorter.quickSort(sorter.new GPAComparator());
        sorter.outArray();

        System.out.println("\n=== Сортировка по фамилии - сортировка слиянием ===");
        sorter.mergeSort(sorter.new NameComparator());
        sorter.outArray();

        System.out.println("\n=== Сортировка по нескольким критериям (курс → GPA → фамилия) ===");
        sorter.sortByMultipleCriteria();
        sorter.outArray();
    }
}