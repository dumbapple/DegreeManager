package model;

import java.util.ArrayList;
import java.util.List;

// represents a student
public class Student {
    private String name;
    private boolean canGraduate;
    private int studentID;
    private int yearOfStudy;
    private List<Course> coursesTaken;
    private Specialization specialization;
//    private Transcript transcript;

    public Student(String name, Specialization specialization, int studentID, int yearOfStudy) {
        canGraduate = false;
        coursesTaken = new ArrayList<>();
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        this.specialization = specialization;
        this.name = name;
//        Transcript studentTranscript = new Transcript();
    }

    public boolean isAbleToGraduate() {
        return canGraduate;
    }

    public void setCanGraduate(boolean canGraduate) {
        this.canGraduate = canGraduate;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

//    public Transcript getTranscript() {
//        return transcript;
//    }

    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(List<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}
