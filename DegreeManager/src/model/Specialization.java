package model;

import java.util.ArrayList;
import java.util.List;

// represents a specialization a student may choose
public class Specialization {
    private String name;
    private Faculty faculty;
    private List<Course> coursesRequired;

    public Specialization(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
        coursesRequired = new ArrayList<>();
    }

    public List<Course> getCoursesRequired() {
        return coursesRequired;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
