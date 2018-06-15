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
//
//    public double getStudentAverage() {
//        return managee.getTranscript().returnAverage(managee.getCoursesTaken());
//    }

    public void showTranscript() {
        for (Course course : managee.getCoursesTaken()) {
            System.out.println(course.getName() + " " + course.getGrade() + " " + course.getCredit());
        }
    }

    public void showMainMenu() {
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to edit your course registration");
    }

    public void showProfileInfo() {
        System.out.println("Name: " + managee.getName());
        System.out.println("UBC ID: " + managee.getStudentID());
    }
}
