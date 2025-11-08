package ru.mirea.lab15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CountryBox extends JFrame {
    JComboBox<String> countryComboBox;
    JTextArea infoArea;

    CountryBox() {
        super("Выбор страны");
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Австралия", "Китай", "Англия", "Россия"};
        countryComboBox = new JComboBox<>(countries);

        infoArea = new JTextArea(10, 30);
        infoArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(infoArea);

        add(new JLabel("Выберите страну:"));
        add(countryComboBox);
        add(scrollPane);

        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                displayCountryInfo(selectedCountry);
            }
        });

        setVisible(true);
    }

    private void displayCountryInfo(String country) {
        String info = "";
        switch(country) {
            case "Австралия":
                info = "Столица: Канберра\nНаселение: 27,2 млн\nЯзык: Английский";
                break;
            case "Китай":
                info = "Столица: Пекин\nНаселение: 1.4 млрд\nЯзык: Китайский";
                break;
            case "Англия":
                info = "Столица: Лондон\nНаселение: 56,5 млн\nЯзык: Английский";
                break;
            case "Россия":
                info = "Столица: Москва\nНаселение: 143,5 млн\nЯзык: Русский";
                break;
        }
        infoArea.setText("Информация о стране:\n\n\n" + info);
    }
}
