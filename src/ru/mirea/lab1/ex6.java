package ru.mirea.lab1;

public class ex6 {
    public static void main(String[] args) {
        float summ = 0.0f;
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i=1; i<11; i++) {
            summ += 1.0f / i;
            System.out.printf("S(%d) = %.3f%n", i, summ);
        }
    }
}
