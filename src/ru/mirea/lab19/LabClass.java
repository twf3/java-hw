package ru.mirea.lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LabClass {
    private List<Student> students = new ArrayList();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void sortByGPA() {
        Collections.sort(this.students);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void printStudents() {
        if (this.students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            System.out.println("Список студентов:");
            for(int i = 0; i < this.students.size(); ++i) {
                System.out.println(i + 1 + ". " + String.valueOf(this.students.get(i)));
            }

        }
    }

    public static void main(String[] args) {
        LabClass lab = new LabClass();
        Scanner scanner = new Scanner(System.in);
        lab.addStudent(new Student("Иванов Иван Иванович", 4.5));
        lab.addStudent(new Student("Петров Петр Петрович", 3.7));
        lab.addStudent(new Student("Сидорова Анна Михайловна", 4.9));
        lab.addStudent(new Student("Иванова Мария Сергеевна", 4.2));
        lab.addStudent(new Student("Петрова Ольга Владимировна", 3.9));

        lab.sortByGPA();
        lab.printStudents();

        System.out.println("\nПоиск студента по ФИО");
        System.out.print("Введите ФИО для поиска: ");
        String searchName = scanner.nextLine();

        try {
            Student found = StudentSearch.findStudentByName(lab.getStudents(), searchName);
            System.out.println("Найден студент: " + String.valueOf(found));
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        scanner.close();
    }
}
