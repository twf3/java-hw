package ru.mirea.lab22;

public class RPNCalculatorTest {
    public static void main(String[] args) {
        RPNCalculator calc = new RPNCalculator();

        calc.push(2);
        calc.push(3);
        calc.performOperation("+");
        System.out.println("2 + 3 = " + calc.getResult());
        calc.clear();

        calc.push(10);
        calc.push(4);
        calc.performOperation("-");
        System.out.println("10 - 4 = " + calc.getResult());
        calc.clear();

        calc.push(3);
        calc.push(7);
        calc.performOperation("*");
        System.out.println("3 * 7 = " + calc.getResult());
        calc.clear();

        calc.push(15);
        calc.push(3);
        calc.performOperation("/");
        System.out.println("15 / 3 = " + calc.getResult());
        calc.clear();

        calc.push(2);
        calc.push(3);
        calc.performOperation("*");
        calc.push(4);
        calc.push(5);
        calc.performOperation("*");
        calc.performOperation("+");
        System.out.println("(2*3) + (4*5) = " + calc.getResult());
        calc.clear();

        calc.push(2);
        calc.push(3);
        calc.push(4);
        calc.push(5);
        calc.push(6);
        calc.performOperation("*");
        calc.performOperation("+");
        calc.performOperation("-");
        calc.performOperation("/");
        System.out.println("2 / (3 - (4 + (5 * 6))) = " + calc.getResult());
        calc.clear();

        try {
            calc.push(8);
            calc.push(0);
            calc.performOperation("/");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        calc.clear();

        try {
            calc.pop();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
