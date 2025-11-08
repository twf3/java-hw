package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task4 {
    public static void main(String[] args) {
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9",
                "123 + 456",
                "7 - 8" };

        String regex = "\\d\\s*\\+";
        for (String test : tests) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(test);

            boolean hasPlus = matcher.find();
            System.out.println(test + (hasPlus ? " правильно" : " неправильно"));
        }
    }
}