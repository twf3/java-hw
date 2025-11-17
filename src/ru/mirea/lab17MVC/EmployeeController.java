package ru.mirea.lab17MVC;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) { model.setName(name); }
    public void setEmployeeId(String id) { model.setId(id); }
    public void setEmployeeSalary(double salary) { model.setSalary(salary); }

    public String getEmployeeName() { return model.getName(); }
    public String getEmployeeId() { return model.getId(); }
    public double getEmployeeSalary() { return model.getSalary(); }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getId(), model.getSalary());
    }
}
