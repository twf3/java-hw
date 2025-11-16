package ru.mirea.lab19;

public class Student implements Comparable<Student> {
    private String fullName;
    private double GPA;

    public Student(String fullName, double GPA) {
        this.fullName = fullName;
        this.GPA = GPA;
    }

    public String getFullName() {
        return this.fullName;
    }

    public double getGPA() {
        return this.GPA;
    }

    public int compareTo(Student other) {
        return Double.compare(other.GPA, this.GPA);
    }

    public String toString() {
        return this.fullName + " - " + this.GPA;
    }
}
