package ru.mirea.lab13;

public class StringTask {
    public static void analyzeString(String str) {

        System.out.println("2. последний символ: '" + str.charAt(str.length() - 1) + "'");
        System.out.println("3. заканчивается подстрокой '!!!': " + str.endsWith("!!!"));
        System.out.println("4. начинается с 'I like': " + str.startsWith("I like"));
        System.out.println("5. содержит подстроку 'Java': " + str.contains("Java"));
        System.out.println("6. индекс подстроки 'Java': " + str.indexOf("Java"));
        System.out.println("7. замена 'a' на 'o': " + str.replace('a', 'o'));
        System.out.println("8. верхний регистр: " + str.toUpperCase());
        System.out.println("9. нижний регистр: " + str.toLowerCase());

        // 10. Вырезать строку Java с помощью метода String.substring()
        if (str.contains("Java")) {
            String javaSubstring = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
            System.out.println("10. вырезанная подстрока 'Java': " + javaSubstring);
        }
    }

    public static void main(String[] args) {
        String testString = "I like Java!!!";
        System.out.println("1. исходная строка: " + testString);
        analyzeString(testString);
    }
}
