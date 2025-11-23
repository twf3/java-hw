package ru.mirea.lab17;

import java.util.Scanner;

class DoublyStudent {
    private String name;
    private int age;
    private String group;
    private double averageGrade;
    private DoublyStudent next;
    private DoublyStudent prev;

    public DoublyStudent() {
        this.next = null;
        this.prev = null;
    }

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

    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);
        System.out.println("Средний балл: " + averageGrade + "\n");
    }

    public DoublyStudent getNext() { return next; }
    public void setNext(DoublyStudent next) { this.next = next; }
    public DoublyStudent getPrev() { return prev; }
    public void setPrev(DoublyStudent prev) { this.prev = prev; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
