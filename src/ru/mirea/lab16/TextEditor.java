package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public TextEditor() {
        initUI();
    }

    private void initUI() {
        setTitle("Text Editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText("Введите здесь свой текст: ");
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        JMenuBar menuBar = new JMenuBar();
        colorMenu = new JMenu("Цвет");
        JMenuItem blueColor = new JMenuItem("Синий");
        JMenuItem redColor = new JMenuItem("Красный");
        JMenuItem blackColor = new JMenuItem("Черный");

        blueColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        redColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        blackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        colorMenu.add(blueColor);
        colorMenu.add(redColor);
        colorMenu.add(blackColor);

        fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
        JMenuItem msSansSerif = new JMenuItem("MS Sans Serif");
        JMenuItem courierNew = new JMenuItem("Courier New");

        timesNewRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font currentFont = textArea.getFont();
                textArea.setFont(new Font("Times New Roman", currentFont.getStyle(), currentFont.getSize()));
            }
        });

        msSansSerif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font currentFont = textArea.getFont();
                textArea.setFont(new Font("MS Sans Serif", currentFont.getStyle(), currentFont.getSize()));
            }
        });

        courierNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font currentFont = textArea.getFont();
                textArea.setFont(new Font("Courier New", currentFont.getStyle(), currentFont.getSize()));
            }
        });

        fontMenu.add(timesNewRoman);
        fontMenu.add(msSansSerif);
        fontMenu.add(courierNew);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        // компоновка
        mainPanel.add(menuBar, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        setJMenuBar(menuBar);
        add(mainPanel);

        pack();
        setSize(500, 300);
        setLocationRelativeTo(null);
    }
}