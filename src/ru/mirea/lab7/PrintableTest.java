package ru.mirea.lab7;

public class PrintableTest {
    public static void main(String[] args) {
        // Простой массив с разными типами
        Printable[] items = {
                new Magazine("Журнал 1", 1, "Январь"),
                new Magazine("Журнал 2", 2, "Февраль"),
        };

        Magazine.printMagazines(items);
    }
}
