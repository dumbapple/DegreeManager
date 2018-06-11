package model;

import java.util.List;

// represents an online transcript for a given student
public class Transcript {

    public Transcript() {


    }

    public void computeAverage(List<Course> selectedCourses) {
        double init = 0;
        double numCoursesSelected = selectedCourses.size();
        for (Course course : selectedCourses) {
            init = init + course.getGrade();
        }



    }

}
