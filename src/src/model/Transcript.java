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
