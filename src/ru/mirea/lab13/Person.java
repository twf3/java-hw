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

    public static void main(String[] args) {
        // Тестирование класса
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Иванов", "Иван", "");
        Person person3 = new Person("Иванов", "", "");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}