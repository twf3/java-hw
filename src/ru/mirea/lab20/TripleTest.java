package ru.mirea.lab20;

public class TripleTest {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple =
                new Triple<>("Hello", 123, 55.66);
        triple.printTypes();
    }
}
