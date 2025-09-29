package ru.mirea.lab3;

public class testConverter {
    public static void main(String[] args) {
        converter converter = new converter();

        converter.printConvert(1000, "RUB", "USD");
        converter.printConvert(1000, "RUB", "EUR");

        converter.printConvert(100, "USD", "RUB");
        converter.printConvert(100, "EUR", "RUB");

        converter.printConvert(50, "USD", "EUR");
        converter.printConvert(50, "EUR", "USD");
    }
}
