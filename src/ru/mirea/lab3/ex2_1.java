package ru.mirea.lab3;

public class ex2_1 {
    public static void main(String[] args) {
        // 1. преобразование к Double
        Double num1 = Double.valueOf(3.52);
        Double num2 = Double.valueOf("5.0939");
        System.out.println(num1 + " " + num2 + "\n");

        // 2. преобразование String к double
        double num3 = Double.parseDouble("7.9398");
        double num4 = Double.parseDouble("-900.99");
        System.out.println(num3 + " " + num4 + "\n");

        // 3. преобразование объекта Double ко всем примитивным типам
        Double obj = Double.valueOf("3.1415926");
        byte byte_obj = obj.byteValue();
        short short_obj = obj.shortValue();
        int int_obj = obj.intValue();
        long long_obj = obj.longValue();
        float float_obj = obj.floatValue();
        double double_obj = obj.doubleValue();

        System.out.println("Double " + obj);
        System.out.println("byte " + byte_obj);
        System.out.println("short " + short_obj);
        System.out.println("int " + int_obj);
        System.out.println("long " + long_obj);
        System.out.println("float " + float_obj);
        System.out.println("double " + double_obj);
        System.out.println("byte " + byte_obj + "\n");

        // 4. вывести значение Double на консоль
        System.out.println("Double object: " + obj);
        System.out.printf("formatted object: %.2f", obj);
        System.out.println("\n" + "string: " + obj.toString() + "\n");

        // 5. преобразование литерал double к строке
        String d1 = Double.toString(3.14);
        String d2 = Double.toString(-4532.01);
        System.out.println("strings " + d1 + " " + d2);
    }
}
