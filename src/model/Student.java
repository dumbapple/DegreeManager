package model;

import java.util.ArrayList;
import java.util.List;

// Represents a student
public class Student {
//    private boolean canGraduate;
    private String name;
    private int studentID;
    private int yearOfStudy;
    private List<Course> coursesTaken;
    private Specialization specialization;
    private Transcript transcript;

    public Student() {
        coursesTaken = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
}
