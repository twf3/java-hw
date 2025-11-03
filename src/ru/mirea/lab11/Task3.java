package ru.mirea.lab11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Student {
    private int id;
    private String name;
    private Date birthDate;

    public Student(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formattedBirthDate(String formatType) {
        SimpleDateFormat sdf;

        switch (formatType) {
            case "short":
                sdf = new SimpleDateFormat("dd.MM.yy");
                break;
            case "medium":
                sdf = new SimpleDateFormat("dd MMM yyyy");
                break;
            case "full":
                sdf = new SimpleDateFormat("EEEE, d MMMM yyyy 'г.'");
                break;
            default:
                sdf = new SimpleDateFormat("d-M-yy");
        }

        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Student{id=" + id + ", name=" + name + ", birthDate=" + formattedBirthDate("full") + "}";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
}

public class Task3 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.MAY, 15);
        Student student = new Student(1, "Петров", cal.getTime());

        // Тестируем различные форматы вывода
        System.out.println("Короткий формат: " + student.formattedBirthDate("short"));
        System.out.println("Средний формат: " + student.formattedBirthDate("medium"));
        System.out.println("Полный формат: " + student.formattedBirthDate("full"));
        System.out.println("toString(): " + student.toString());
    }
}