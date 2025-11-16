package ru.mirea.lab19;

import java.util.Scanner;

public class INNCheck {
    public static boolean isValidINN(String inn) {
        return inn.matches("\\d{12}");
    }

    public static void processOrder(String fullName, String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный ИНН: " + inn + " (клиент " + fullName + ")");
        } else {
            System.out.println("Заказ успешно оформлен для: " + fullName + ", ИНН: " + inn);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН (12 цифр): ");
        String inn = scanner.nextLine();

        try {
            processOrder(fullName, inn);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        scanner.close();
    }
}
