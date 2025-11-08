package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy12", "smart_pass", "A007"};

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        // ?= проверяет что будет дальше, поэтому *,а не +

        for (String password : passwords) {
            boolean isValid = Pattern.matches(regex, password);
            System.out.println(password + (isValid ? " надёжный" : " ненадёжный"));
        }
    }
}