package ru.mirea.lab17;

class StudentGroup {
    private Student head; // начало списка
    private int size;

    // a) Функция создания пустого списка
    public StudentGroup() {
        head = null;
        size = 0;
    }

    // b) Функция добавления элемента (узла) списка
    public void addStudent() {
        Student newStudent = new Student();
        newStudent.readFromConsole();

        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newStudent);
        }
        size++;
    }

    // c) Функция удаления элемента из списка
    public void removeStudent(String name) {
        if (head == null) {
            System.out.println("Группа пуста!");
            return;
        }

        if (head.getName().equals(name)) {
            head = head.getNext();
            size--;
            System.out.println("Студент " + name + " удален из группы");
            return;
        }

        Student current = head;
        Student previous = null;

        while (current != null && !current.getName().equals(name)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Студент с именем " + name + " не найден");
        } else {
            previous.setNext(current.getNext());
            size--;
            System.out.println("Студент " + name + " удален из группы");
        }
    }

    // d) Функция вывода элемента (узла) списка на экран
    public void displayStudent(String name) {
        Student current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                System.out.println("\nНайден студент:");
                current.display();
                return;
            }
            current = current.getNext();
        }
        System.out.println("Студент с именем " + name + " не найден");
    }

    // e) Функция очистки списка
    public void clearGroup() {
        head = null;
        size = 0;
        System.out.println("Группа очищена");
    }

    // f) Функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
