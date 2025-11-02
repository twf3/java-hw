package ru.mirea.lab13;

public class TestAddress {
    public static void main(String[] args) {
        String[] addresses = {
                "Россия,Московская область,Москва,Проспект Мира,15,1,25",
                "Беларусь.Минская область.Минск.Победы-20-2-30",
                "Казахстан;Алматинская область;Алматы;Абая;10;3;45",
                "США-Калифорния-Лос-Анджелес,Голливуд,123,,",
                "США,Флорида,Майами,Оушен Драйв,12,,8"
        };

        System.out.println("a)");
        for (int i = 0; i < addresses.length; i++) {
            Address addr = new Address();
            addr.parseAddressWithSplit(addresses[i]);
            System.out.println(addr);
        }

        System.out.println("\nб)");
        for (int i = 0; i < addresses.length; i++) {
            Address addr = new Address();
            addr.parseAddressWithTokenizer(addresses[i]);
            System.out.println(addr);
        }
    }
}