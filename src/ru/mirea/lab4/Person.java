package ru.mirea.lab4;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Unknown name";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String move() {
        return fullName + " двигается";
    }

    public String talk() {
        return fullName + " говорит";
    }

    public String getFullName() { return fullName; }

    public int getAge() { return age; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setAge(int age) { this.age = age; }

    public static void main(String[] args) {
        Person person1 = new Person("Человек", 19);
        System.out.println(person1.move());
        System.out.println(person1.talk());

        Person person2 = new Person();
        System.out.println(person2.move());
        System.out.println(person2.talk());
        System.out.println(person2.getFullName());
        System.out.println(person2.getAge());

    }
}
