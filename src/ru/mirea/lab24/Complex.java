package ru.mirea.lab24;

public class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() { return real; }
    public int getImage() { return image; }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
