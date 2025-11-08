package ru.mirea.lab15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame {
    JTextField field1 = new JTextField(5);
    JTextField field2 = new JTextField(5);
    JButton addButton = new JButton("Сложить");
    JButton subtractButton = new JButton("Вычесть");
    JButton multiplyButton = new JButton("Умножить");
    JButton divideButton = new JButton("Разделить");

    Calculator() {
        super("Calculator");
        setLayout(new GridLayout(2, 2, 20, 20));
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 2, 20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        mainPanel.add(new JLabel("1 число:"));
        mainPanel.add(field1);
        mainPanel.add(new JLabel("2 число:"));
        mainPanel.add(field2);

        mainPanel.add(addButton);
        mainPanel.add(subtractButton);
        mainPanel.add(multiplyButton);
        mainPanel.add(divideButton);
        add(mainPanel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('/');
            }
        });

        setVisible(true);
    }

    private void calculate(char operation) {
        try {
            double x1 = Double.parseDouble(field1.getText().trim());
            double x2 = Double.parseDouble(field2.getText().trim());
            double result = 0;
            String operationSymbol = "";

            switch(operation) {
                case '+':
                    result = x1 + x2;
                    operationSymbol = "+";
                    break;
                case '-':
                    result = x1 - x2;
                    operationSymbol = "-";
                    break;
                case '*':
                    result = x1 * x2;
                    operationSymbol = "×";
                    break;
                case '/':
                    if(x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: деление на ноль!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = x1 / x2;
                    operationSymbol = "÷";
                    break;
            }

            JOptionPane.showMessageDialog(null, String.format("%.2f %s %.2f = %.2f", x1, operationSymbol, x2, result), "Результат", JOptionPane.INFORMATION_MESSAGE);

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Некорректные числовые значения :(", "Упс!", JOptionPane.ERROR_MESSAGE);
        }
    }
}