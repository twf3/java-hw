package ru.mirea.lab25;

import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String[] testEmails = {
                "user@example.com",
                "root@localhost",
                "myhost@@com.ru",
                "@my.ru",
                "Julia String",
        };

        for (String email : testEmails) {
            boolean isValid = isEmailValid(email);
            System.out.println(email + " - " + (isValid ? "верно" : "неверно"));
        }
    }

    public static boolean isEmailValid(String email) {
        String regex = "^[\\w.%+-]+@[\\w.-]+(\\.[A-Za-z]{2,})?$";
        return Pattern.matches(regex, email);
    }
}
