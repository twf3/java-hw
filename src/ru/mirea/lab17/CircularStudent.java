package ru.mirea.lab17;

import java.util.Scanner;

class CircularStudent {
    private String name;
    private int age;
    private String group;
    private double averageGrade;
    private CircularStudent next;

    public CircularStudent() {
        this.next = null;
    }

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя студента: ");
        this.name = scanner.nextLine();
        System.out.print("Возраст студента: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Группа студента: ");
        this.group = scanner.nextLine();
        System.out.print("Средний балл студента: ");
        this.averageGrade = scanner.nextDouble();
        scanner.nextLine();
    }

    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
        System.out.println("Средний балл: " + averageGrade + "\n");
    }

    public CircularStudent getNext() { return next; }
    public void setNext(CircularStudent next) { this.next = next; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
