package model;

import java.util.ArrayList;
import java.util.List;

// Represents a specialization a student may choose
public class Specialization {
    private String name;
    private Faculty faculty;
    private List<Course> coursesNeeded;
    private List<Course> coursesForYearThree;
    private List<Course> coursesForYearFour;

    public Specialization(String name) {
        this.name = name;
        coursesNeeded = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public List<Course> getCoursesNeeded() {
        return coursesNeeded;
    }

    public List<Course> getCoursesForYearThree() {
        return coursesForYearThree;
    }

    public List<Course> getCoursesForYearFour() {
        return coursesForYearFour;
    }
}
