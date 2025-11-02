package ru.mirea.lab11;

import java.util.*;

public class Task5 {
    private static final int OPERATION_COUNT = 100000;

    public static void main(String[] args) {
        compareAddToEnd();
        compareAddToBeginning();
        compareInsertInMiddle();
        compareRemoveFromBeginning();
        compareRemoveFromEnd();
        compareSearchByIndex();
        compareSearchByValue();
    }

    private static void compareAddToEnd() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            linkedList.add(i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("1. Add to end:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareAddToBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(0, i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            linkedList.add(0, i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n2. Add tp beginning:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareInsertInMiddle() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n3. Insert in middle:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareRemoveFromBeginning() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            arrayList.remove(0);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            linkedList.remove(0);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n4. Remove from beginning:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareRemoveFromEnd() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n5. Remove from end:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareSearchByIndex() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            arrayList.get(i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            linkedList.get(i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n6. Search by index:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void compareSearchByValue() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < OPERATION_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            arrayList.contains(i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < OPERATION_COUNT / 10; i++) {
            linkedList.contains(i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("\n7. Search by value:");
        System.out.printf("ArrayList: " + arrayListTime + " нс\n");
        System.out.printf("LinkedList: " + linkedListTime + " нс\n");
        printComparison(arrayListTime, linkedListTime);
    }

    private static void printComparison(long time1, long time2) {
        if (time1 < time2) {
            System.out.printf("ArrayList быстрее в %.2f раз\n", (double)time2/time1);
        } else {
            System.out.printf("LinkedList быстрее в %.2f раз\n", (double)time1/time2);
        }
    }
}