package model;

import java.util.ArrayList;
import java.util.List;

// Represents a student
public class Student {
    private String name;
    private int schoolID;
    private int studyYear;
    private String specialization;
    private boolean isHonours;
    private StudentManager studentManager;
    private List<Course> coursesTaken;
    private Transcript transcript;

    public Student() {
        coursesTaken = new ArrayList<>();
        studentManager = new StudentManager(this);
        transcript = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public void setSpec(String name) {
        specialization = name;
    }

    public String getSpec() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isHonours() {
        return isHonours;
    }

    public void setHonours(boolean input) {
        isHonours = input;
    }

    public StudentManager getStudentManager() {
        return studentManager;
    }

    public List<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
}
