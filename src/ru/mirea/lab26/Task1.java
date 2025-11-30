package ru.mirea.lab26;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static <T> void reverseArray(T[] array) {
        Stack<T> stack = new Stack<>();
        for (T element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}
