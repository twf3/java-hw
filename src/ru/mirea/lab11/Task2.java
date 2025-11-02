package ru.mirea.lab11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату для сравнения (дд.мм.гггг): ");
        String userInput = scanner.nextLine();

        try {
            Date userDate = dateFormatter.parse(userInput);

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            Date currentDate = cal.getTime();

            System.out.println("Текущая дата: " + dateFormatter.format(currentDate));
            System.out.println("Введенная дата: " + dateFormatter.format(userDate));

            if (userDate.equals(currentDate)) {
                System.out.println("Даты равны");
            }
            else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата РАНЬШЕ текущей");
            }
            else {
                System.out.println("Введенная дата ПОЗЖЕ текущей");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка");
        }

        scanner.close();
    }
}