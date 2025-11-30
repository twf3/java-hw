package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;

public class CalculatorView {
    private JFrame frame;
    private JTextField displayField;
    private JTextArea stackArea;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton enterButton, clearButton, clearEntryButton;

    public CalculatorView() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("RPN Калькулятор (MVC)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel displayPanel = new JPanel(new BorderLayout());

        displayField = new JTextField("0", 20);
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.BOLD, 24));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setBackground(Color.WHITE);
        displayField.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        stackArea = new JTextArea(3, 20);
        stackArea.setEditable(false);
        stackArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        stackArea.setBackground(new Color(240, 240, 240));
        stackArea.setBorder(BorderFactory.createTitledBorder("Информация о стеке"));
        JScrollPane scrollPane = new JScrollPane(stackArea);

        displayPanel.add(displayField, BorderLayout.NORTH);
        displayPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        initializeButtons(buttonPanel);

        frame.add(displayPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(350, 500);
        frame.setLocationRelativeTo(null);
    }

    private void initializeButtons(JPanel buttonPanel) {
        numberButtons = new JButton[10];

        for (int i = 7; i <= 9; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("/");
        operatorButtons[0].setBackground(new Color(255, 200, 200));
        buttonPanel.add(operatorButtons[0]);

        for (int i = 4; i <= 6; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons[1] = new JButton("*");
        operatorButtons[1].setBackground(new Color(255, 200, 200));
        buttonPanel.add(operatorButtons[1]);

        for (int i = 1; i <= 3; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons[2] = new JButton("-");
        operatorButtons[2].setBackground(new Color(255, 200, 200));
        buttonPanel.add(operatorButtons[2]);

        numberButtons[0] = new JButton("0");
        buttonPanel.add(numberButtons[0]);

        clearEntryButton = new JButton("CE");
        clearEntryButton.setBackground(new Color(255, 255, 200));
        buttonPanel.add(clearEntryButton);

        clearButton = new JButton("C");
        clearButton.setBackground(new Color(255, 255, 200));
        buttonPanel.add(clearButton);

        operatorButtons[3] = new JButton("+");
        operatorButtons[3].setBackground(new Color(255, 200, 200));
        buttonPanel.add(operatorButtons[3]);

        enterButton = new JButton("Enter");
        enterButton.setBackground(new Color(200, 255, 200));
        buttonPanel.add(enterButton);
    }

    public void updateDisplay(String value) {
        displayField.setText(value);
    }

    public void updateStackInfo(String info) {
        stackArea.setText(info);
    }

    public JButton getNumberButton(int number) {
        return numberButtons[number];
    }

    public JButton getOperatorButton(int index) {
        return operatorButtons[index];
    }

    public JButton getEnterButton() {
        return enterButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getClearEntryButton() {
        return clearEntryButton;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(frame, message, "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}