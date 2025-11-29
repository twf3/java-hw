package ru.mirea.lab22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        attachEventHandlers();
        updateView();
    }

    private void attachEventHandlers() {
        for (int i = 0; i <= 9; i++) {
            final int digit = i;
            view.getNumberButton(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.inputNumber(String.valueOf(digit));
                    updateView();
                }
            });
        }

        String[] operators = {"/", "*", "-", "+"};
        for (int i = 0; i < operators.length; i++) {
            final String operator = operators[i];
            view.getOperatorButton(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        model.performOperation(operator);
                        updateView();
                    } catch (Exception ex) {
                        view.showError(ex.getMessage());
                        updateView();
                    }
                }
            });
        }

        view.getEnterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.enter();
                updateView();
            }
        });

        view.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.clear();
                updateView();
            }
        });

        view.getClearEntryButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.clearEntry();
                updateView();
            }
        });
    }

    private void updateView() {
        view.updateDisplay(model.getDisplayValue());
        view.updateStackInfo(model.getStackInfo());
    }
}