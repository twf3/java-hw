package ru.mirea.lab6;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Начало: " + point);
        point.moveUp();
        System.out.println("moveUp(): " + point);
        point.moveRight();
        System.out.println("moveRight(): " + point);
        point.moveDown();
        System.out.println("moveDown(): " + point);
        point.moveLeft();
        System.out.println("moveLeft(): " + point + '\n');

        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        System.out.println("Начало: " + circle);
        circle.moveUp();
        System.out.println("moveUp(): " + circle);
        circle.moveRight();
        System.out.println("moveRight(): " + circle);
        circle.moveDown();
        System.out.println("moveDown(): " + circle);
        circle.moveLeft();
        System.out.println("moveLeft(): " + circle + '\n');

        MovableRectangle rect = new MovableRectangle(0, 0, 4, 2, 1, 1);
        System.out.println("Начало: " + rect);
        rect.moveRight();
        System.out.println("moveRight(): " + rect);
        rect.moveUp();
        System.out.println("moveUp()" + rect);
        rect.moveLeft();
        System.out.println("moveLeft(): " + rect);
        rect.moveDown();
        System.out.println("moveDown()9: " + rect);
    }
}