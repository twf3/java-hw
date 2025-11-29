package ru.mirea.lab22;

import java.util.Stack;

public class RPNCalculator {
    private Stack<Double> stack;

    public RPNCalculator() {
        stack = new Stack<>();
    }

    public void push(double value) {
        stack.push(value);
    }

    public double pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Пустой стек");
        }
        return stack.pop();
    }

    public void performOperation(String operator) {
        if (stack.size() < 2) {
            throw new IllegalStateException("Недостаточно операндов");
        }

        double b = pop();
        double a = pop();
        double result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
        push(result);
    }

    public double getResult() {
        if (stack.size() != 1) {
            throw new IllegalStateException("Некорректное выражение");
        }
        return stack.peek();
    }

    public void clear() {
        stack.clear();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String getStackContents() {
        return stack.toString();
    }
}