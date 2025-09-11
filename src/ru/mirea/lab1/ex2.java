package ru.mirea.lab1;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrLength = sc.nextInt();
        int summ = 0;
        int i = 0;
        int maxEl = 0;
        int minEl = 1000000000;
        int[] arr = new int[arrLength];
        while (i < arrLength) {
            arr[i] = sc.nextInt();
            if (arr[i] < minEl) {
                minEl = arr[i];
            }
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
            summ = summ + arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива: ");
        System.out.println(summ);
        System.out.println("Минимальный элемент: ");
        System.out.println(minEl);
        System.out.println("Максимальный элемент: ");
        System.out.println(maxEl);
}}
