package ru.mirea.lab13;

public class PhoneNumberFormatter {
    public static String formatPhoneNumber(String phone) {
        String countryCode;
        String number;

        if (phone.startsWith("+")) {
            // +<Код страны><Номер 10 цифр>
            countryCode = phone.substring(1, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            // 8<Номер 10 цифр>
            countryCode = "7";
            number = phone.substring(1);
        } else {
            return "неверный формат номера";
        }

        // +<Код страны><Три цифры><Три цифры><Четыре цифры>
        return String.format("+%s%s%s%s",
                countryCode,
                number.substring(0, 3),
                number.substring(3, 6),
                number.substring(6));
    }

}