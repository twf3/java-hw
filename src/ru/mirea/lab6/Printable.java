package ru.mirea.lab6;

public interface Printable {
    void print();
}

class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Название книги: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
    }

    public String getName() { return name; }

    public String getAuthor() { return author; }

    public int getYear() { return year; }
}

class Notes implements Printable {
    private String title;
    private int count;
    private boolean access;

    public Notes(String title, int count, boolean access) {
        this.title = title;
        this.count = count;
        this.access = access;
    }

    @Override
    public void print() {
        System.out.println("Заголовок заметки: " + title);
        System.out.println("Количество слов: " + count);
        System.out.println("Наличие доступа: " + access);
    }

    public String getTitle() { return title; }

    public int getCount() { return count; }

    public boolean getAccess() { return access; }
}

class Song implements Printable {
    private String title;
    private int length;
    private String genre;

    public Song(String title, int length, String genre) {
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("Название песни: " + title);
        System.out.println("Продолжительность: " + length + " секунд");
        System.out.println("Жанр: " + genre);
    }

    public String getTitle() { return title; }

    public int getLength() { return length; }

    public String getGenre() { return genre; }

}
