package ru.mirea.lab11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);System.out.print("Год: ");
        int year = scanner.nextInt();

        System.out.print("Месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Число: ");
        int day = scanner.nextInt();

        System.out.print("Часы: ");
        int hours = scanner.nextInt();

        System.out.print("Минуты: ");
        int minutes = scanner.nextInt();

        // создание объекта Date
        Date date = new Date(year - 1900, month - 1, day, hours, minutes);

        // создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        System.out.println("\nСозданные объекты:");
        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());

        scanner.close();
    }
}
