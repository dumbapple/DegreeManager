package model;

import java.util.ArrayList;
import java.util.List;

// represents a transcript for a given student
public class Transcript {
    private Student associatedStudent;
    private List<Course> courses;

    public Transcript(Student associatedStudent) {
        this.associatedStudent = associatedStudent;
        courses = new ArrayList<>();
    }

    public Student getAssociatedStudent() {
        return associatedStudent;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public double calculateAverage(List<Course> selectedCourses) {
        double init = 0;
        for (Course course : selectedCourses) {
            init += course.getGrade();
        }
        return init / selectedCourses.size();
    }

    public void showCoursesTaken() {
        for (Course course : associatedStudent.getCoursesTaken()) {
            System.out.println("Course: " + course.getName() + " " + "Grade: " + course.getGrade() + " " + "Credit: " + course.getCredit());
        }
    }
}
