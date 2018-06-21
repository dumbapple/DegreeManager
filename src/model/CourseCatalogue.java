package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseCatalogue {
    private List<Course> biolCourses;
    private List<Course> chemCourses;
    private List<Course> cpscCourses;
    private List<Course> englCourses;
    private List<Course> mathCourses;
    private List<Course> physCourses;
    private List<Course> statCourses;

    public CourseCatalogue() {
        biolCourses = new ArrayList<>();
        chemCourses = new ArrayList<>();
        cpscCourses = new ArrayList<>();
        englCourses = new ArrayList<>();
        mathCourses = new ArrayList<>();
        physCourses = new ArrayList<>();
        statCourses = new ArrayList<>();
        makeBiologyCourses();
        makeChemistryCourses();
        makeComputerScienceCourses();
        makeEnglishCourses();
        makeMathCourses();
        makePhysicsCourses();
        makeStatisticsCourses();
    }

    private void makeBiologyCourses() {
        Course biol112 = new Course("BIOL 112", 3);
        Course biol121 = new Course("BIOL 121", 3);
        Course biol140 = new Course("BIOL 140", 2);
        Course biol153 = new Course("BIOL 153", 7);
        Course biol155 = new Course("BIOL 155", 6);
        Course biol200 = new Course("BIOL 200", 3);
        Course biol201 = new Course("BIOL 201", 3);
        Course biol203 = new Course("BIOL 203", 3);
        Collections.addAll(biolCourses, biol112, biol121, biol140,
                biol153, biol155, biol200, biol201, biol203);
    }
    public List<Course> getBiologyCourses() {
        return biolCourses;
    }

    private void makeChemistryCourses() {
        Course chem121 = new Course("CHEM 121", 4);
        Course chem123 = new Course("CHEM 123", 4);
        Course chem203 = new Course("CHEM 203", 4);
        Course chem205 = new Course("CHEM 205", 3);
        Course chem208 = new Course("CHEM 208", 3);
        Course chem211 = new Course("CHEM 211", 4);
        Course chem213 = new Course("CHEM 213", 3);
        Course chem233 = new Course("CHEM 233", 4);
        Course chem235 = new Course("CHEM 235", 1);
        Course chem245 = new Course("CHEM 245", 1);
        Collections.addAll(chemCourses, chem121, chem123, chem203, chem205,
                chem208, chem211, chem213, chem233, chem235, chem245);
    }
    public List<Course> getChemistryCourses() {
        return chemCourses;
    }

    private void makeComputerScienceCourses() {
        Course cpsc103 = new Course("CPSC 103", 3);
        Course cpsc110 = new Course("CPSC 110", 4);
        Course cpsc121 = new Course("CPSC 121", 4);
        Course cpsc210 = new Course("CPSC 210", 4);
        Course cpsc213 = new Course("CPSC 213", 4);
        Course cpsc221 = new Course("CPSC 221", 4);
        Collections.addAll(cpscCourses, cpsc110, cpsc121, cpsc210, cpsc213, cpsc221);
    }
    public List<Course> getComputerScienceCourses() {
        return cpscCourses;
    }

    private void makeEnglishCourses() {
        Course engl110 = new Course("ENGL 110", 3);
        Course engl111 = new Course("ENGL 111", 3);
        Course engl112 = new Course("ENGL 112", 3);
        Collections.addAll(englCourses, engl110, engl111, engl112);
    }
    public List<Course> getEnglishCourses() {
        return englCourses;
    }

    private void makeMathCourses() {
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
        Collections.addAll(mathCourses, math100, math101, math102, math103,
                math104, math105, math180, math200, math220, math221);
    }
    public List<Course> getMathCourses() {
        return mathCourses;
    }

    private void makePhysicsCourses() {
        Course phys101 = new Course("PHYS 101", 3);
        Course phys107 = new Course("PHYS 107", 3);
        Course phys108 = new Course("PHYS 108", 3);
        Course phys109 = new Course("PHYS 109", 3);
        Course phys117 = new Course("PHYS 117", 3);
        Course phys118 = new Course("PHYS 118", 3);;
        Course phys119 = new Course("PHYS 119", 1);
        Collections.addAll(physCourses, phys101, phys107, phys108, phys109, phys117, phys118, phys119);
    }
    public List<Course> getPhysicsCourses() {
        return physCourses;
    }

    private void makeStatisticsCourses() {
        Course stat200 = new Course("STAT 200", 3);
        Course stat203 = new Course("STAT 203", 3);
        Course stat251 = new Course("STAT 251", 3);
        Course stat300 = new Course("STAT 300", 3);
        Course stat302 = new Course("STAT 302", 3);
        Course stat305 = new Course("STAT 305", 3);
        Course stat306 = new Course("STAT 306", 3);
        Collections.addAll(statCourses, stat200, stat203, stat251, stat300, stat302, stat305, stat306);
    }
    public List<Course> getStatisticsCourses() {
        return statCourses;
    }
}
