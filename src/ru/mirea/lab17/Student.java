package ru.mirea.lab17;

import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String group;
    private double averageGrade;
    private Student next; // ссылка на следующий элемент

    public Student() {
        this.next = null;
    }

    // a) функция считывания атрибутов объекта с консоли
    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя студента: ");
        this.name = scanner.nextLine();

        System.out.print("Возраст студента: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Группу студента: ");
        this.group = scanner.nextLine();

        System.out.print("Средний балл студента: ");
        this.averageGrade = scanner.nextDouble();
        scanner.nextLine();
    }

    // b) функция вывода атрибутов на экран
    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
        System.out.println("Средний балл: " + averageGrade + "\n");
    }

    public Student getNext() { return next; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGroup() { return group; }
    public double getAverageGrade() { return averageGrade; }

    public void setName(String name) { this.name = name; }
    public void setNext(Student next) { this.next = next; }
    public void setAge(int age) { this.age = age; }
    public void setGroup(String group) { this.group = group; }
    public void setAverageGrade(double averageGrade) { this.averageGrade = averageGrade; }
}