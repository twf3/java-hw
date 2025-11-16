package ru.mirea.lab10;

import java.util.*;

class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber;

    public SortingStudentsByGPA() {
        this.iDNumber = new ArrayList<>();
    }

    // 1) метод заполнения массива
    public void setArray(ArrayList<Student> students) {
        this.iDNumber = new ArrayList<>(students);
    }

    // 2) метод, реализующий компаратор для сортировки по gpa по убыванию
    class GPAComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }

    // метод, реализующий компаратор для сортировки по имени
    class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.getLastName().compareTo(b.getLastName());
        }
    }

    public void quickSort(Comparator<Student> comparator) {
        quickSortHelper(0, iDNumber.size() - 1, comparator);
    }

    private void quickSortHelper(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(low, high, comparator);
            quickSortHelper(low, pivotIndex - 1, comparator);
            quickSortHelper(pivotIndex + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<Student> comparator) {
        Student pivot = iDNumber.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(iDNumber.get(j), pivot) <= 0) {
                i++;

                Student temp = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, temp);
            }
        }

        Student temp = iDNumber.get(i + 1);
        iDNumber.set(i + 1, iDNumber.get(high));
        iDNumber.set(high, temp);

        return i + 1;
    }

    public void mergeSort(Comparator<Student> comparator) {
        if (iDNumber.size() > 1) {
            ArrayList<Student> sorted = mergeSortHelper(new ArrayList<>(iDNumber), comparator);
            iDNumber = sorted;
        }
    }

    private ArrayList<Student> mergeSortHelper(ArrayList<Student> list, Comparator<Student> comparator) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        ArrayList<Student> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSortHelper(left, comparator);
        right = mergeSortHelper(right, comparator);

        return merge(left, right, comparator);
    }

    private ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right, Comparator<Student> comparator) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public void sortByMultipleCriteria() {
        // цепочка компараторов
        Comparator<Student> multiCriteriaComparator =
                Comparator.comparing(Student::getCourse)  // 1-й критерий: курс
                        .thenComparing(Comparator.comparing(Student::getGpa).reversed())  // 2-й критерий: GPA (по убыв)
                        .thenComparing(Student::getLastName);  // 3-й критерий: фамилия

        Collections.sort(iDNumber, multiCriteriaComparator);
    }
}