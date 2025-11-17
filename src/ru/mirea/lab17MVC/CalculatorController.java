package ru.mirea.lab17MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // добавляем слушатели к кнопкам
        this.view.getAddButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        this.view.getSubtractButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });

        this.view.getMultiplyButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        this.view.getDivideButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });
    }

    private void calculate(char operator) {
        try {
            double num1 = view.getFirstNumber();
            double num2 = view.getSecondNumber();

            switch (operator) {
                case '+':
                    model.add(num1, num2);
                    break;
                case '-':
                    model.subtract(num1, num2);
                    break;
                case '*':
                    model.multiply(num1, num2);
                    break;
                case '/':
                    model.divide(num1, num2);
                    break;
            }

            double result = model.getResult();
            if (Double.isNaN(result)) {
                view.showError("Ошибка: деление на ноль!");
            } else {
                view.setResult(result);
            }

        } catch (NumberFormatException ex) {
            view.showError("Ошибка: введите корректные числа!");
        }
    }
}
