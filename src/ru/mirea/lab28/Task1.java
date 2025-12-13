package ru.mirea.lab28;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("banana");
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("grape");
        hashSet.add("kiwi");

        System.out.println("HashSet: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}