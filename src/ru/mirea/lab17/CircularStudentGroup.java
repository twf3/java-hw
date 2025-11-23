package ru.mirea.lab17;

import java.io.*;

class CircularStudentGroup {
    private CircularStudent tail;
    private int size;

    public CircularStudentGroup() {
        tail = null;
        size = 0;
    }

    public void addStudent() {
        CircularStudent newStudent = new CircularStudent();
        newStudent.readFromConsole();
        if (tail == null) {
            tail = newStudent;
            tail.setNext(tail);
        } else {
            newStudent.setNext(tail.getNext());
            tail.setNext(newStudent);
            tail = newStudent;
        }
        size++;
        System.out.println("Студент добавлен в группу");
    }

    public void removeStudent(String name) {
        if (tail == null) {
            System.out.println("Группа пуста");
            return;
        }
        if (tail.getNext() == tail && tail.getName().equals(name)) {
            tail = null;
            size--;
            System.out.println("Студент " + name + " удален");
            return;
        }
        CircularStudent current = tail;
        CircularStudent prev = null;

        do {
            prev = current;
            current = current.getNext();

            if (current.getName().equals(name)) {
                prev.setNext(current.getNext());
                if (current == tail) {
                    tail = prev;
                }
                size--;
                System.out.println("Студент " + name + " удален");
                return;
            }
        } while (current != tail);

        System.out.println("Студент не найден");
    }

    public void findStudent(String name) {
        if (tail == null) {
            System.out.println("Группа пуста");
            return;
        }
        CircularStudent current = tail.getNext();
        do {
            if (current.getName().equals(name)) {
                System.out.println("Студент найден:");
                current.display();
                return;
            }
            current = current.getNext();
        } while (current != tail.getNext());

        System.out.println("Студент с именем " + name + " не найден!");
    }

    public void clearGroup() {
        tail = null;
        size = 0;
        System.out.println("Группа очищена");
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public int getSize() {
        return size;
    }
}