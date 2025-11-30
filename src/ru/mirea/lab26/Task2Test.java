package ru.mirea.lab26;

import java.util.Iterator;

public class Task2Test {
    public static void main(String[] args) {
        Task2.SimpleLinkedList<String> myList = new Task2.SimpleLinkedList<>();

        myList.add("apple");
        myList.add("carrot");
        myList.add("cabbage");
        myList.add("tomato");
        System.out.println(myList.get(1));
        System.out.println(myList.size());

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
