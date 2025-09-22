package ru.mirea.lab2;

public class Dog {
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public double getAge() { return age; }

    public void setAge(double age) { this.age = age; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double DogToHuman() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Кличка: " + name +
                ", возраст: " + age + " лет" +
                ", человеческий возраст: " + DogToHuman() + " лет";
    }

}
