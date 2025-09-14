package ru.mirea.lab1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float summ = 0.0f;
        int[] arr = new int[a];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            summ = summ + arr[i];
        }
        System.out.println(summ / arr.length);
    }}