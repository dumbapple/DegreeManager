package model;

// Represents a course taken by the student
public class Course {
    private String name;
    private int credit;
    private int grade;
    private boolean isUpperYear;

    public Course(String name, int credit, boolean isUpperYear) {
        this.name = name;
        this.credit = credit;
        this.isUpperYear = isUpperYear;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isUpperYear() {
        return isUpperYear;
    }
}
