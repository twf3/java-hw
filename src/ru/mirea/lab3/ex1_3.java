package ru.mirea.lab3;
import java.util.Random;

public class ex1_3 {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(10,100);
        }

        for (int i=0; i<arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

        int flag = 1;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) {
                flag = 0;
                break;
            }
        }
        System.out.println("\n" + flag);
    }
}
