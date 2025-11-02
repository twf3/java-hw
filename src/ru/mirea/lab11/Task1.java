package ru.mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.OCTOBER, 1, 0, 0, 0);
        Date startDate = cal.getTime();
        Date endDate = new Date();

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: Горбунова");
        System.out.println("Дата и время получения задания: " + dateFormatter.format(startDate));
        System.out.println("Дата и время сдачи задания: " + dateFormatter.format(endDate));

        // вычисляем разницу во времени
        long diff = endDate.getTime() - startDate.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        System.out.println("Время выполнения: " + days + " дней " + hours + " часов");
    }
}