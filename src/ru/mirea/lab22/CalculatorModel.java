package ru.mirea.lab22;

public class CalculatorModel {
    private RPNCalculator calculator;
    private String displayValue;
    private String stackInfo;

    public CalculatorModel() {
        calculator = new RPNCalculator();
        displayValue = "0";
        stackInfo = "Стек пуст";
    }

    public void inputNumber(String number) {
        if (displayValue.equals("0") || displayValue.equals("Ошибка")) {
            displayValue = number;
        } else {
            displayValue += number;
        }
        updateStackInfo();
    }

    public void enter() {
        try {
            if (!displayValue.equals("0") && !displayValue.equals("Ошибка")) {
                double value = Double.parseDouble(displayValue);
                calculator.push(value);
                displayValue = "0";
                updateStackInfo();
            }
        } catch (NumberFormatException e) {
            displayValue = "Ошибка";
        }
    }

    public void performOperation(String operator) {
        try {
            if (!displayValue.equals("0") && !displayValue.equals("Ошибка")) {
                enter();
            }

            calculator.performOperation(operator);
            displayValue = String.valueOf(calculator.getResult());
            updateStackInfo();

        } catch (Exception e) {
            displayValue = "Ошибка";
            throw e;
        }
    }

    public void clear() {
        calculator.clear();
        displayValue = "0";
        updateStackInfo();
    }

    public void clearEntry() {
        displayValue = "0";
    }

    private void updateStackInfo() {
        if (calculator.isEmpty()) {
            stackInfo = "Стек пуст";
        } else {
            stackInfo = "Стек: " + calculator.getStackContents();
        }
    }

    public String getDisplayValue() { return displayValue; }

    public String getStackInfo() { return stackInfo; }
}
