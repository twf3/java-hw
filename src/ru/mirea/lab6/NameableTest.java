package ru.mirea.lab6;

public class NameableTest {
    public static void main(String[] args) {
        Person dude = new Person("Dude", 20);
        System.out.println(dude.getName());
        System.out.println(dude.toString() + '\n');

        Animal dog = new Animal("Dawg", "Dog", 5);
        System.out.println(dog.getName());
        System.out.println(dog.toString() + '\n');

        Planet earth = new Planet("Earth", 5.972e24);
        System.out.println(earth.getName());
        System.out.println(earth.toString() + '\n');
    }
}
