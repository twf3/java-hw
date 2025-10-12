package ru.mirea.lab7;

public class MathCalculableTest {
    public static void main(String[] args) {
        // интерфейсная ссылка для вызова базовых методов
        MathCalculable calc = new MathFunc();
        System.out.println("2^10 = " + calc.power(2, 10));
        System.out.println("10^(-2) = " + calc.power(10, -2));

        System.out.println("|0 + 5i| = " + calc.complexModule(0, 5));
        System.out.println("|3 + i| = " + calc.complexModule(3, 1));

        System.out.println("PI = " + MathCalculable.PI);

        // классовая ссылка для вызов доп. методов (всех)
        MathFunc math = new MathFunc();
        processMathFunc(math);
    }

    public static void processMathFunc(MathFunc math) {
        System.out.println("C = " + math.circleLength(4));
        System.out.println("S = " + math.circleArea(3));
        System.out.println("V = " + math.sphereVolume(7));
    }
}


