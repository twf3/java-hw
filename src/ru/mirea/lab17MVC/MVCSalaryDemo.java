package ru.mirea.lab17MVC;

public class MVCSalaryDemo {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        controller.setEmployeeSalary(75000);
        System.out.println("\nSalary update:");
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee emp = new Employee();
        emp.setName("Ivan Ivanov");
        emp.setId("1");
        emp.setSalary(50000);
        return emp;
    }
}
