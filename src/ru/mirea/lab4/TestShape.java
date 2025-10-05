package ru.mirea.lab4;

public class TestShape {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0, "blue", true);
        Rectangle rect1 = new Rectangle(2.0, 4.0);
        Square square1 = new Square(5.0);

        System.out.println(circle1.toString());
        System.out.println("Круг:");
        System.out.println("r = " + circle1.getRadius());
        System.out.println("S = " + circle1.getArea());
        System.out.println("C = " + circle1.getPerimeter());
        System.out.println("Заполнение: " + circle1.isFilled());
        System.out.println("Цвет: " + circle1.getColor() + '\n');

        System.out.println(rect1.toString());
        System.out.println("Прямоугольник:");
        System.out.println("Длина: " + rect1.getLength());
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("S = " + rect1.getArea());
        System.out.println("P = " + rect1.getPerimeter());
        System.out.println("Заполнение: " + rect1.isFilled());
        System.out.println("Цвет: " + rect1.getColor() + "\n");

        System.out.println(square1.toString());
        System.out.println("Квадрат:");
        System.out.println("Сторона: " + square1.getSide());
        System.out.println("S = " + square1.getArea());
        System.out.println("P = " + square1.getPerimeter());
        System.out.println("Заполнение: " + square1.isFilled());
        System.out.println("Цвет: " + square1.getColor());



    }
}
