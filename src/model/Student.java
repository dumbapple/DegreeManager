package model;

import java.util.ArrayList;
import java.util.List;

// represents a student
public class Student {
    private String name;
//    private boolean canGraduate;
    private int studentID;
    private int yearOfStudy;
    private List<Course> coursesTaken;
    private Specialization specialization;
//    private Transcript transcript;

    public Student(String name, int studentID, int yearOfStudy, Specialization specialization) {
//        canGraduate = false;
        this.name = name;
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        coursesTaken = new ArrayList<>();
        this.specialization = specialization;
//        Transcript studentTranscript = new Transcript();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void addCoursesTaken(List<Course> courseList) {
        coursesTaken.addAll(courseList);
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
