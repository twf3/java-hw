package ru.mirea.lab20;

public class MinMaxTest {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
    }
}
