package ru.mirea.lab17MVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) { model.setName(name); }

    public String getStudentName() { return model.getName(); }

    public void setStudentId(String id) { model.setId(id); }

    public String getStudentId() { return model.getId(); }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getId());
    }
}
