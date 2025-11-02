package ru.mirea.lab9;

interface MyComparable {
    int compareTo(Object other);
}

class Student implements MyComparable {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object other) {
        Student otherStudent = (Student) other;
        return this.id - otherStudent.id;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (GPA: " + gpa + ")";
    }
}

public class Task4 {
    public static void insertionSort(MyComparable[] list) {
        for (int i = 1; i < list.length; i++) {
            MyComparable current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(current) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        MyComparable[] students = {
                new Student(5, "Иван", 3.7),
                new Student(2, "Мария", 4.9),
                new Student(8, "Петр", 2.7),
                new Student(1, "Анна", 4.5)
        };

        System.out.println("До сортировки:");
        for (MyComparable s : students) {
            System.out.println(s);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (MyComparable s : students) {
            System.out.println(s);
        }
    }
}