package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ksenia", "ksenia.novak28@mail.ru", 'F');
        System.out.println(author.toString() + "\n");

        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender() + "\n");

        author.setEmail("new.email@gmail.com");
        System.out.println("New email: " + author.getEmail());
    }
}
