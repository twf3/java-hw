package ru.mirea.lab17MVC;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {
    private JFrame frame;
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    public CalculatorView() {
        frame = new JFrame("MVC Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("Первое число:"));
        firstNumber = new JTextField();
        frame.add(firstNumber);

        frame.add(new JLabel("Второе число:"));
        secondNumber = new JTextField();
        frame.add(secondNumber);

        frame.add(new JLabel("Результат:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        frame.add(resultField);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);

        frame.setVisible(true);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumber.getText());
    }

    public void setResult(double result) {
        resultField.setText(String.valueOf(result));
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    // Метод для показа ошибок
    public void showError(String errorMessage) {
        JOptionPane.showMessageDialog(frame, errorMessage);
    }
}
