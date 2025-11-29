package ru.mirea.lab22;

import javax.swing.*;

public class CalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorModel model = new CalculatorModel();
                CalculatorView view = new CalculatorView();
                CalculatorController controller = new CalculatorController(model, view);
                view.getFrame().setVisible(true);
            }
        });
    }
}