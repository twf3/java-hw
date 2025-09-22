package ru.mirea.lab2;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() { return x; }

    public void setX(double x) { this.x = x; }

    public double getY() { return y; }

    public void setY(double y) { this.y = y; }

    public double getR() { return r; }

    public void setR(double r) { this.r = r; }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getSquare() { return Math.PI * (Math.pow(r, 2)); }

    public double getLength() { return 2 * Math.PI * r; }

    public String compare(Circle circle2) {
        if (this.r > circle2.r) {
            return "Текущая окружность больше другой";
        }
        if (this.r < circle2.r) {
            return "Текущая окружность меньше другой";
        }
        else {
            return "Окружности равны";
        }
    }
    @Override
    public String toString() {
        return "Circle(" + x + "; " + y + ")" + "; R = " + r;
    }
}
