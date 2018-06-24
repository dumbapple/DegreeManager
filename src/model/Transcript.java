package model;

import java.text.DecimalFormat;
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
        DecimalFormat format = new DecimalFormat("#.00");
        double init = 0;
        for (Course course : selectedCourses) {
            init += course.getGrade();
        }
        return Double.parseDouble(format.format(init / selectedCourses.size()));
    }

    public int sumAllCredits(List<Course> courses) {
        int init = 0;
        for (Course course : courses) {
            init = init + course.getCredit();
        }
        return init;
    }

    public int sumCondCredits(List<Course> courseList) {
        int init = 0;
        for (Course c : associatedStudent.getCoursesTaken()) {
            if (courseList.contains(c)) {
                init += c.getCredit();
            }
        }
        return init;
    }

    public void display() {
        System.out.println("\n" + "Thanks for your help. Here is your transcript:");
        System.out.println("\n" + "\n" + "TRANSCRIPT");
        System.out.println("--------------------------------------");
        for (Course c : associatedStudent.getCoursesTaken()) {
            System.out.println("Course: " + c.getName() +
                    "   " + "Grade: " + c.getGrade() + "%" +
                    "   " + "Credit: " + c.getCredit());

        }

        System.out.println("Your cumulative average: " + calculateAverage(associatedStudent.getCoursesTaken()) + "%");
        System.out.println("Your total credits: " + sumAllCredits(associatedStudent.getCoursesTaken()));
    }
}
