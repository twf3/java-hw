package ru.mirea.lab1;

import java.util.Scanner;

public class ex7 {
    public static long factorial(int n) {
        long res = 1;
        for (int i=1; i<=n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.printf("%d! = %d%n", i, factorial(i));
        }
    }
}
