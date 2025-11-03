package ru.mirea.lab13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordChain {

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        result.append(wordList.get(0));
        wordList.remove(0);

        boolean found;
        do {
            found = false;
            String lastWord = result.toString();
            char lastChar = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));

            for (int i = 0; i < wordList.size(); i++) {
                String currentWord = wordList.get(i);
                char firstChar = Character.toLowerCase(currentWord.charAt(0));

                if (lastChar == firstChar) {
                    result.append(" ").append(currentWord);
                    wordList.remove(i);
                    found = true;
                    break;
                }
            }
        } while (found && !wordList.isEmpty());

        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.print("Введите имя файла: ");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();

            List<String> words = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] lineWords = line.split("\\s+");
                    words.addAll(Arrays.asList(lineWords));
                }
            }

            String result = getLine(words.toArray(new String[0]));
            System.out.println("Результат: " + result);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}