package ru.mirea.lab7;

public interface MathCalculable {
    double power(double base, double exponent);
    double complexModule(double real, double imaginary);
    double PI = 3.141592653589793;
}

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModule(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // дополнительные методы
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public double circleArea(double radius) {
        return PI * power(radius, 2);
    }

    public double sphereVolume(double radius) {
        return (4.0 / 3.0) * PI * power(radius, 3);
    }
}