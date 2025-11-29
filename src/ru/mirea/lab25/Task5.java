package ru.mirea.lab25;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String[] testDates = {
                "29/02/2000",
                "30/04/2003",
                "01/01/2003",
                "29/02/2001",
                "30-04-2003",
                "1/1/1899",
        };

        for (String date : testDates) {
            boolean isValid = isDateValid(date);
            System.out.println(date + " - " + (isValid ? "верно" : "неверно"));
        }
    }

    public static boolean isDateValid(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2}|[2-9]\\d{3})$";

        if (!Pattern.matches(regex, date)) {
            return false;
        }

        // доп проверка
        return isValidLogicalDate(date);
    }

    private static boolean isValidLogicalDate(String date) {
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // проверка месяцев с 30 днями
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }

        // проверка февраля
        if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear && day > 29) return false;
            if (!isLeapYear && day > 28) return false;
        }
        return true;
    }
}