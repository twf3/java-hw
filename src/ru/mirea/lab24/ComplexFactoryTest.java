package ru.mirea.lab24;

public class ComplexFactoryTest {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(5, 3));
    }
}