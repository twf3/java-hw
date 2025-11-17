package ru.mirea.lab17MVC;

public class MVCStudentDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Anna");
        System.out.println("\nAfter update:");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("John");
        student.setId("1");
        return student;
    }
}
