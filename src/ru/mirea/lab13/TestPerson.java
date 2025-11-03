package ru.mirea.lab13;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Иванов", "Иван", "");
        Person person3 = new Person("Иванов", "", "");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}
