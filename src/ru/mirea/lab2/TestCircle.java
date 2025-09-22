package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0, 4.0, 3.0);
        System.out.println(circle1.toString());

        circle1.setXY(0.0, 0.0);
        System.out.println("x = " + circle1.getX() + " y = " + circle1.getY());

        System.out.println("S = " + circle1.getSquare());
        System.out.println("C = " + circle1.getLength());

        Circle circle2 = new Circle(0.0, 0.0, 4.0);
        System.out.println(circle1.compare(circle2));
    }
}
