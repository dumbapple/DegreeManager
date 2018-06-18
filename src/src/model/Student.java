package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Represents a student
public class Student {
    //    private boolean canGraduate;
    private String name;
    private int studentID;
    private int yearOfStudy;
    private StudentManager associatedManager;
    private List<Course> coursesTaken;
    private Specialization specialization;
    private Transcript transcript;

    public Student() {
        coursesTaken = new ArrayList<>();
        associatedManager = new StudentManager(this);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return studentID;
    }


    public int getStudyYear() {
        return yearOfStudy;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void addCoursesTaken(List<Course> courseList) {
        coursesTaken.addAll(courseList);
    }

    public StudentManager getManager() {
        return associatedManager;
    }

    public void gatherStudentInformation(Scanner sc) {
        setName(associatedManager.logName(sc));
        setStudentID(associatedManager.logStudentID(sc));
        setYearOfStudy(associatedManager.logStudyYear(sc));
        setSpecialization(associatedManager.logSpecialization(sc));
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    private void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    private void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

//    public Transcript getTranscript() {
//        return transcript;
//    }
//
//    public void setTranscript(Transcript transcript) {
//        this.transcript = transcript;
//    }

}
