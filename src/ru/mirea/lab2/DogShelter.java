package ru.mirea.lab2;
import java.util.Scanner;

public class DogShelter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во собак в потомнике: ");
        int dogs_number = sc.nextInt();
        sc.nextLine();
        Dog[] dogs = new Dog[dogs_number];

        for (int i=0; i<dogs_number; i++) {
            System.out.println("Кличка: ");
            String name = sc.nextLine();

            System.out.println("Возраст: ");
            Double age = sc.nextDouble();
            sc.nextLine();

            dogs[i] = new Dog(name, age);
        }

        for (int i=0; i<dogs_number; i++) {
            System.out.println(dogs[i].toString());
        }

        // проверка сеттеров
        Dog test_dog = dogs[0];
        System.out.println("Введите новую кличку для первой собаки: ");
        test_dog.setName(sc.nextLine());
        System.out.printf("Новая кличка - " + test_dog.getName());
        sc.nextLine();

        System.out.println("Введите новый возраст для первой собаки: ");
        test_dog.setAge(sc.nextDouble());
        System.out.println("Новый возраст - " + test_dog.getAge());
    }
}
