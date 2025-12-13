package ru.mirea.lab27;

public class HashTabTest {
    public static void main(String[] args) {
        HashTab table = new HashTab(20);

        table.hashtabAdd("apple", "10");
        table.hashtabAdd("banana", "20");
        table.hashtabAdd("orange", "30");
        table.hashtabAdd("grape", "40");
        table.hashtabAdd("melon", "50");
        table.hashtabAdd("peach", "60");
        table.hashtabAdd("pear", "70");
        table.hashtabAdd("kiwi", "80");
        table.hashtabAdd("mango", "90");
        table.hashtabAdd("berry", "100");

        System.out.println("Поиск 'apple': " + table.hashtabLookup("apple"));
        System.out.println("Поиск 'mango': " + table.hashtabLookup("mango"));

        table.hashtabDelete("banana");
        System.out.println("После удаления 'banana': " + table.hashtabLookup("banana"));
    }
}
