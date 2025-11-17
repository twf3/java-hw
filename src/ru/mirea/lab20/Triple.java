package ru.mirea.lab20;

public class Triple<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public V getSecond() { return second; }
    public K getThird() { return third; }

    public void setFirst(T first) { this.first = first; }
    public void setSecond(V second) { this.second = second; }
    public void setThird(K third) { this.third = third; }

    public void printTypes() {
        System.out.println("Тип T: " + first.getClass());
        System.out.println("Тип V: " + second.getClass());
        System.out.println("Тип K: " + third.getClass());
    }
}
