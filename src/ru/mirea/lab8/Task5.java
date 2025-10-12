package ru.mirea.lab8;

public class Task5 {
        public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(num + " = " + sumOfDigits(num));
    }
}