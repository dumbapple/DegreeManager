package model;

import java.util.ArrayList;
import java.util.List;

// represents a transcript for a given student
public class Transcript {
    private List<Course> courses;

    public Transcript() {
        courses = new ArrayList<>();
    }

    public double returnAverage(List<Course> selectedCourses) {
        double init = 0;
        double numCoursesSelected = selectedCourses.size();
        for (Course course : selectedCourses) {
            double courseGrade = course.getGrade();
            init += courseGrade;
        }
        return init / numCoursesSelected;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

//    public List<Course> getSelectedCourses() {
//
//    }

}
