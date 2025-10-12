package ru.mirea.lab8;

public class Task7 {
    public static void printTask7(int n, int divisor) {
        // базовый случай
        if (n == 1) {
            return;
        }

        if (divisor * divisor > n) {
            System.out.print(n + " ");
            return;
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            printTask7(n / divisor, divisor);
        } else {
            if (divisor == 2) {
                printTask7(n, 3);
            } else {
                printTask7(n, divisor + 2);
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.print("Простые множители числа " + n + ": ");
        printTask7(n, 2);
    }
}