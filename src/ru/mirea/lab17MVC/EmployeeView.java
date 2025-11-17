package ru.mirea.lab17MVC;

public class EmployeeView {
    public void printEmployeeDetails(String name, String id, double salary) {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
