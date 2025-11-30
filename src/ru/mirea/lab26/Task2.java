package ru.mirea.lab26;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task2 {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // №3
    private static class SimpleLinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public SimpleLinkedListIterator(Node<T> head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("В списке больше нет элементов.");
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    // №2
    public static class SimpleLinkedList<T> implements Iterable<T> {
        private Node<T> head;
        private int size = 0;

        public void add(T item) {
            Node<T> newNode = new Node<>(item);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
            }
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        public int size() {
            return size;
        }

        @Override
        public Iterator<T> iterator() {
            return new SimpleLinkedListIterator<>(head);
        }
    }
}
