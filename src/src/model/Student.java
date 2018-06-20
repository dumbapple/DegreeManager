package model;

import java.util.ArrayList;
import java.util.List;

// Represents a student
public class Student {
    private String name;
    private int schoolID;
    private int studyYear;
    private Specialization specialization;
    private String isHonours;
    private StudentManager studentManager;
    private List<Course> coursesTaken;
    private Transcript transcript;

    public Student() {
        coursesTaken = new ArrayList<>();
        studentManager = new StudentManager(this);
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return schoolID;
    }
    public int getStudyYear() {
        return studyYear;
    }
    public Specialization getSpecialization() {
        return specialization;
    }
    public String isHonours() {
        return isHonours;
    }
    public void setHonours(String input) {
        isHonours = input;
    }
    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }
    public Transcript getTranscript() {
        return transcript;
    }
    public StudentManager getStudentManager() {
        return studentManager;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }
    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }
    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

}
