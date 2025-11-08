package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        // ^ - начало строки, $ - конец строки

        System.out.println(Pattern.matches(regex, "abcdefghijklmnopqrstuv18340"));
        System.out.println(Pattern.matches(regex, "abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}