package ru.mirea.lab6;

public interface Nameable {
    String getName();
}

class Person implements Nameable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() { return name; }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Person (name: " + name + ", age: " + age + ")";
    }
}

class Planet implements Nameable {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getName() { return name; }

    public double getMass() {return mass; }

    @Override
    public String toString() {
        return "Planet (name: " + name + ", mass: " + mass + " kg)";
    }
}

class Animal implements Nameable {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String getName() { return name; }

    public String getSpecies() { return species; }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Animal (name: " + name + ", species: " + species + ", age: " + age + ")";
    }
}