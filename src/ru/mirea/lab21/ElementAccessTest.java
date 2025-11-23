package ru.mirea.lab21;

public class ElementAccessTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "grape"};
        Integer[] numbers = {10, 20, 30, 40, 50};
        Double[] prices = {1.99, 2.49, 3.99, 0.99};

        System.out.println("fruit with index 2: " + ElementAccess.getElementByIndex(fruits, 2));
        System.out.println("number with index 3: " + ElementAccess.getElementByIndex(numbers, 3));
        System.out.println("price with index 1: " + ElementAccess.getElementByIndex(prices, 1));

        try {
            System.out.println("Попытка получить элемент с индексом -1: " +
                    ElementAccess.getElementByIndex(numbers, -1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
