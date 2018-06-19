package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseManager {
    private List<Course> mathCourses;
    private List<Course> englCourses;
    private List<Course> cpscCourses;
    private List<Course> chemCourses;
    private List<Course> biolCourses;
    private List<Course> physCourses;
    private List<Course> statCourses;


    public CourseManager() {
        mathCourses = new ArrayList<>();
        englCourses = new ArrayList<>();
        cpscCourses = new ArrayList<>();
        chemCourses = new ArrayList<>();
        biolCourses = new ArrayList<>();
        physCourses = new ArrayList<>();
        statCourses = new ArrayList<>();

    }



    public List<Course> returnMathCourses() {
        Course math100 = new Course("MATH 100", 3);
        Course math101 = new Course("MATH 101", 3);
        Course math102 = new Course("MATH 102", 3);
        Course math103 = new Course("MATH 103", 3);
        Course math104 = new Course("MATH 104", 3);
        Course math105 = new Course("MATH 105", 3);
        Course math180 = new Course("MATH 180", 3);
        Course math200 = new Course("MATH 200", 3);
        Course math220 = new Course("MATH 220", 3);
        Course math221 = new Course("MATH 221", 3);
        Collections.addAll(mathCourses, math100, math101, math102, math103, math104, math105, math180);
        return mathCourses;

    }
    List<Course> firstYearCourses = new ArrayList<>();
    Course chem121 = new Course("CHEM 121", 4);
    Course chem123 = new Course("CHEM 123", 4);
    Course phys101 = new Course("PHYS 101", 3);



    Course engl110 = new Course("ENGL 110", 3);
    Course engl112 = new Course("ENGL 112", 3);

//    List<Course> cpscCourses = new ArrayList<>();
    Course cpsc110 = new Course("CPSC 110", 4);
    Course cpsc121 = new Course("CPSC 121", 4);
    Course cpsc210 = new Course("CPSC 110", 4);
    Course cpsc213 = new Course("CPSC 121", 4);
    Course cpsc221 = new Course("CPSC 110", 4);

//    List<Course> mathCourses = new ArrayList<>();
    Course math100 = new Course("MATH 100", 3);
    Course math101 = new Course("MATH 101", 3);
    Course math102 = new Course("MATH 102", 3);
    Course math103 = new Course("MATH 103", 3);
    Course math104 = new Course("MATH 104", 3);
    Course math105 = new Course("MATH 105", 3);
    Course math180 = new Course("MATH 180", 3);
    Course math200 = new Course("MATH 200", 3);
    Course math220 = new Course("MATH 220", 3);
    Course math221 = new Course("MATH 221", 3);
}
