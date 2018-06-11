package model;

// represents a student
public class Student {
    private boolean canGraduate;
    private double average;
    private int yearOfStudy;
    private Specialization specialization;
    private String name;
    private Transcript transcript;

    public Student(Specialization specialization, String name, int yearOfStudy) {
        canGraduate = false;
        this.yearOfStudy = yearOfStudy;
        this.specialization = specialization;
        this.name = name;
        transcript = new Transcript();
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

    public Transcript getTranscript() {
        return transcript;
    }
}
