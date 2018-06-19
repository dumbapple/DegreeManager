package model;

// Represents a course taken by the student; grades will be rounded to nearest whole percent
public class Course {
    private String name;
    private int credit;
    private int grade;

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }

    // getters & setters
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
}
