package model;

import java.util.List;

// represents a transcript for a given student
public class Transcript {
    private Student associatedStudent;
    private List<Course> coursesListed;

    public Transcript(Student associatedStudent) {
        this.associatedStudent = associatedStudent;
        coursesListed = associatedStudent.getCoursesTaken();
    }

    public Student getAssociatedStudent() {
        return associatedStudent;
    }

    public List<Course> getCoursesListed() {
        return coursesListed;
    }

    private double calculateAverage(List<Course> selectedCourses) {
        double init = 0;
        for (Course course : selectedCourses) {
            init += course.getGrade();
        }
        return init / selectedCourses.size();
    }

    private int sumCredits(List<Course> courses) {
        int init = 0;
        for (Course course : courses) {
            init = init + course.getCredit();
        }
        return init;
    }

    public void display() {
        System.out.println("\n" + "\n" + "TRANSCRIPT");
        System.out.println("--------------------------------------");
        for (Course c : associatedStudent.getCoursesTaken()) {
            System.out.println("Course: " + c.getName() +
                    "   " + "Grade: " + c.getGrade() + "%" +
                    "   " + "Credit: " + c.getCredit());
        }
        System.out.println("Your cumulative average: " + calculateAverage(associatedStudent.getCoursesTaken()) + "%");
        System.out.println("Your total credits: " + sumCredits(associatedStudent.getCoursesTaken()));
    }
}
