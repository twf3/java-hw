package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "25.98 USD, 100 RUB, 44 ERR, 0.004 EU, 50.50 EU.";
        String regex = "\\d+(\\.\\d+)?\\s*(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String price = matcher.group();
            // исключаем цены, начинающиеся с "0."
            if (!price.matches("0\\.\\d+.*")) {
                System.out.println(price);
            }
        }
    }
}
