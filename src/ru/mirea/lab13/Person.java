package ru.mirea.lab13;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        if (patronymic == null) {
            this.patronymic = "";
        } else {
            this.patronymic = patronymic;
        }

        if (name == null) {
            this.name = "";
        } else {
            this.name = name;
        }

        this.surname = surname;
    }


    public String getFullName() {
        StringBuilder sb = new StringBuilder();

        sb.append(surname);

        // добавляем инициалы
        if (!name.isEmpty()) {
            sb.append(" ").append(name.charAt(0)).append(".");

            if (!patronymic.isEmpty()) {
                sb.append(patronymic.charAt(0)).append(".");
            }
        }

        return sb.toString();
    }

    public String getSurname() { return surname; }
    public String getName() { return name; }
    public String getPatronymic() { return patronymic; }


}