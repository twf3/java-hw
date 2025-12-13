package ru.mirea.lab28;

import java.util.*;

public class Task2 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Иван");
        map.put("Кузнецов", "Алексей");
        map.put("Смирнов", "Алексей");
        map.put("Попов", "Сергей");
        map.put("Васильев", "Сергей");
        map.put("Федоров", "Федор");
        map.put("Николаев", "Николай");
        map.put("Александров", "Александр");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map) {
        HashMap<String, Integer> nameCount = new HashMap<>();

        // подсчитываем каждое имя
        for (String firstName : map.values()) {
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }
        int count = 0;
        for (int freq : nameCount.values()) {
            if (freq > 1) {
                count += freq;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map) {
        // ключи уникальные
        return 0;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("\nЛюдей с одинаковыми именами: " + getSameFirstNameCount(map));
        System.out.println("Людей с одинаковыми фамилиями: " + getSameLastNameCount(map));
    }
}