package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2.0, 3.0);
        System.out.println(ball.toString() + "\n");

        System.out.println("x = " + ball.getX());
        System.out.println("y = " + ball.getY());
        ball.setX(5.0);
        ball.setY(5.0);
        System.out.println("x = " + ball.getX() + "; y = " + ball.getY());
        ball.setXY(9.0, 9.0);
        System.out.println("x = " + ball.getX() + "; y = " + ball.getY());
        ball.move(2.0, 3.0);
        System.out.println("x = " + ball.getX() + "; y = " + ball.getY());
    }
}
