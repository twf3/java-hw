package ru.mirea.lab5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultTable {
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchResultTable() {
        JFrame frame = new JFrame("Football Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.setBounds(10, 10, 120, 30);
        madridButton.setBounds(150, 10, 120, 30);
        resultLabel.setBounds(90, 40, 100, 30);
        lastScorerLabel.setBounds(90, 70, 150, 30);
        winnerLabel.setBounds(90, 100, 150, 30);

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateWinner();
                updateLabels();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateWinner();
                updateLabels();
            }
        });

        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }
    }

    private void updateLabels() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        new MatchResultTable();
    }
}