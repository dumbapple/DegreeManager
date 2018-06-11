package model;

import java.util.List;

public class Course {

    private List<Student> studentsEnrolled;
    private int credit;

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public int getCredit() {
        return credit;
    }

    public double getGrade() {
        return 0;
    }
}
