package ru.mirea.lab1;

public class ex6 {
    public static void main(String[] args) {
        float el = 0.0f;
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i=1; i<11; i++) {
            el = 1.0f / i;
            System.out.printf("S(%d) = %.3f%n", i, el);
        }
    }
}
