package ru.mirea.lab28;

public class HashTableWithDoubleKeyTest {
    public static void main(String[] args) {
        HashTableWithDoubleKey hashTable = new HashTableWithDoubleKey(10);

        hashTable.put(3.14, "pi");
        hashTable.put(2.71, "е");
        hashTable.put(1.41, "sqrt(2)");
        hashTable.put(1.73, "sqrt(3)");
        hashTable.put(1.618, "золотое сечение");

        hashTable.printTable();

        System.out.println("\nПоиск элемента с ключом 2.71: " + hashTable.get(2.71));
        System.out.println("Поиск элемента с ключом 1.618: " + hashTable.get(1.618));
        System.out.println("Удаляем элемент с ключом 1.41\n");

        hashTable.remove(1.41);

        hashTable.printTable();
    }
}
