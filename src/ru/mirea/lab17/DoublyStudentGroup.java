package ru.mirea.lab17;

import java.io.*;

class DoublyStudentGroup {
    private DoublyStudent head;
    private DoublyStudent tail;
    private int size;

    public DoublyStudentGroup() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addStudent() {
        DoublyStudent newStudent = new DoublyStudent();
        newStudent.readFromConsole();
        if (head == null) {
            head = newStudent;
        } else {
            tail.setNext(newStudent);
            newStudent.setPrev(tail);
        }
        tail = newStudent;
        size++;
        System.out.println("Студент добавлен в группу");
    }

    public void removeStudent(String name) {
        if (head == null) {
            System.out.println("Группа пуста");
            return;
        }
        DoublyStudent current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                if (current == head) {
                    head = head.getNext();
                    if (head != null) head.setPrev(null);
                } else if (current == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                }
                size--;
                System.out.println("Студент " + name + " удален");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Студент не найден");
    }

    public void findStudent(String name) {
        if (head == null) {
            System.out.println("Группа пуста!");
            return;
        }
        DoublyStudent current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                System.out.println("Студент найден:");
                current.display();
                return;
            }
            current = current.getNext();
        }
        System.out.println("Студент с именем " + name + " не найден!");
    }

    public void clearGroup() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Группа очищена");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
