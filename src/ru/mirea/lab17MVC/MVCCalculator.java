package ru.mirea.lab17MVC;

import javax.swing.SwingUtilities;

public class MVCCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculatorModel model = new CalculatorModel();
                CalculatorView view = new CalculatorView();
                CalculatorController controller = new CalculatorController(model, view);
            }
        });
    }
}
