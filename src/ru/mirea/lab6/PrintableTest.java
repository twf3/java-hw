package ru.mirea.lab6;

public class PrintableTest {
    public static void main(String[] args) {
        Book book = new Book("Тайная история", "Донна Тартт", 1992);
        Notes note = new Notes("Список покупок", 127, true);
        Song song = new Song("Poker Face", 237, "art pop");

        book.print();
        System.out.println();
        note.print();
        System.out.println();
        song.print();
    }
}
