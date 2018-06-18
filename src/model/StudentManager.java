package model;

// manages changes and info display for a given student's studies
public class StudentManager {
    private Student managee;


    public StudentManager(Student managee) {
        this.managee = managee;
    }

    public Student getManagee() {
        return managee;
    }

    public void changeSpecialization(Specialization specialization) {
        managee.setSpecialization(specialization);
    }

    public void showMainMenu() {
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to edit your course registration");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void showProfileInfo() {
        System.out.println("Name: " + managee.getName());
        System.out.println("UBC ID: " + managee.getStudentID());
        System.out.println("Year level: " + managee.getYearOfStudy());
        System.out.println("Specialization: " + managee.getSpecialization().getName());
    }

//    public void enterGrades(List<Course> courses, Scanner scanner) {
//        for (Course c : courses) {
//            System.out.println(c.getName() + ": " + scanner.nextDouble());
//        }
//    }


}
