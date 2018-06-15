package model;

import java.util.ArrayList;
import java.util.List;

// represents a specialization a student may choose
public class Specialization {
    private String name;
    private Faculty faculty;
    private List<Course> coursesNeeded;
    private List<Course> coursesForYrThree;
    private List<Course> coursesForYrFour;

    public Specialization(String name) {
        this.name = name;
        coursesNeeded = new ArrayList<>();
    }

    public List<Course> getCoursesNeeded() {
        return coursesNeeded;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
