package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseCatalogue {
    private List<Course> allCourses;
    private List<Course> biolCourses;
    private List<Course> chemCourses;
    private List<Course> cpscCourses;
    private List<Course> englCourses;
    private List<Course> mathCourses;
    private List<Course> physCourses;
    private List<Course> statCourses;
    private List<Course> artsCourses;
    private List<Course> scienceCourses;
    private List<Course> upperYearCourses;
    private List<Course> upperYearScienceCourses;

    public CourseCatalogue() {
        allCourses = new ArrayList<>();
        biolCourses = new ArrayList<>();
        chemCourses = new ArrayList<>();
        cpscCourses = new ArrayList<>();
        englCourses = new ArrayList<>();
        mathCourses = new ArrayList<>();
        physCourses = new ArrayList<>();
        statCourses = new ArrayList<>();
        artsCourses = new ArrayList<>();
        scienceCourses = new ArrayList<>();
        upperYearCourses = new ArrayList<>();
        upperYearScienceCourses = new ArrayList<>();
        makeBiologyCourses();
        makeChemistryCourses();
        makeComputerScienceCourses();
        makeEnglishCourses();
        makeMathCourses();
        makePhysicsCourses();
        makeStatisticsCourses();
        groupArtsCourses();
        groupScienceCourses();
        groupUpperYearCourses();
        groupUpperYearScienceCourses();
    }

    private void groupUpperYearScienceCourses() {
        for (Course c : allCourses) {
            if (c.isUpperYear() && scienceCourses.contains(c)) {
                upperYearScienceCourses.add(c);
            }
        }
    }

    public List<Course> getUpYrScie() {
        return upperYearScienceCourses;
    }

    private void groupUpperYearCourses() {
        for (Course c : allCourses) {
            if (c.isUpperYear()) {
                upperYearCourses.add(c);
            }
        }
    }

    public List<Course> getUpperYr() {
        return upperYearCourses;
    }

    private void groupArtsCourses() {
        artsCourses.addAll(englCourses);
    }

    public List<Course> getArts() {
        return artsCourses;
    }

    private void groupScienceCourses() {
        scienceCourses.addAll(biolCourses);
        scienceCourses.addAll(chemCourses);
        scienceCourses.addAll(cpscCourses);
        scienceCourses.addAll(mathCourses);
        scienceCourses.addAll(physCourses);
        scienceCourses.addAll(statCourses);
    }

    public List<Course> getScie() {
        return scienceCourses;
    }

    private void makeBiologyCourses() {
        Course biol112 = new Course("BIOL 112", 3, false);
        Course biol121 = new Course("BIOL 121", 3, false);
        Course biol140 = new Course("BIOL 140", 2, false);
        Course biol153 = new Course("BIOL 153", 7, false);
        Course biol155 = new Course("BIOL 155", 6, false);
        Course biol200 = new Course("BIOL 200", 3, false);
        Course biol201 = new Course("BIOL 201", 3, false);
        Course biol203 = new Course("BIOL 203", 3, false);
        Collections.addAll(biolCourses, biol112, biol121, biol140,
                biol153, biol155, biol200, biol201, biol203);
        allCourses.addAll(biolCourses);
    }

    public List<Course> getBiologyCourses() {
        return biolCourses;
    }

    private void makeChemistryCourses() {
        Course chem121 = new Course("CHEM 121", 4, false);
        Course chem123 = new Course("CHEM 123", 4, false);
        Course chem203 = new Course("CHEM 203", 4, false);
        Course chem205 = new Course("CHEM 205", 3, false);
        Course chem208 = new Course("CHEM 208", 3, false);
        Course chem211 = new Course("CHEM 211", 4, false);
        Course chem213 = new Course("CHEM 213", 3, false);
        Course chem233 = new Course("CHEM 233", 4, false);
        Course chem235 = new Course("CHEM 235", 1, false);
        Course chem245 = new Course("CHEM 245", 1, false);
        Collections.addAll(chemCourses, chem121, chem123, chem203, chem205,
                chem208, chem211, chem213, chem233, chem235, chem245);
        allCourses.addAll(chemCourses);
    }

    public List<Course> getChemistryCourses() {
        return chemCourses;
    }

    private void makeComputerScienceCourses() {
        Course cpsc110 = new Course("CPSC 110", 4, false);
        Course cpsc121 = new Course("CPSC 121", 4, false);
        Course cpsc210 = new Course("CPSC 210", 4, false);
        Course cpsc213 = new Course("CPSC 213", 4, false);
        Course cpsc221 = new Course("CPSC 221", 4, false);
        Collections.addAll(cpscCourses, cpsc110, cpsc121, cpsc210, cpsc213, cpsc221);
        allCourses.addAll(cpscCourses);
    }

    public List<Course> getComputerScienceCourses() {
        return cpscCourses;
    }

    private void makeEnglishCourses() {
        Course engl110 = new Course("ENGL 110", 3, false);
        Course engl111 = new Course("ENGL 111", 3, false);
        Course engl112 = new Course("ENGL 112", 3, false);
        Collections.addAll(englCourses, engl110, engl111, engl112);
        allCourses.addAll(englCourses);
    }

    public List<Course> getEnglishCourses() {
        return englCourses;
    }

    private void makeMathCourses() {
        Course math100 = new Course("MATH 100", 3, false);
        Course math101 = new Course("MATH 101", 3, false);
        Course math102 = new Course("MATH 102", 3, false);
        Course math103 = new Course("MATH 103", 3, false);
        Course math104 = new Course("MATH 104", 3, false);
        Course math105 = new Course("MATH 105", 3, false);
        Course math180 = new Course("MATH 180", 3, false);
        Course math200 = new Course("MATH 200", 3, false);
        Course math220 = new Course("MATH 220", 3, false);
        Course math221 = new Course("MATH 221", 3, false);
        Collections.addAll(mathCourses, math100, math101, math102, math103,
                math104, math105, math180, math200, math220, math221);
        allCourses.addAll(mathCourses);
    }

    public List<Course> getMathCourses() {
        return mathCourses;
    }

    private void makePhysicsCourses() {
        Course phys101 = new Course("PHYS 101", 3, false);
        Course phys107 = new Course("PHYS 107", 3, false);
        Course phys108 = new Course("PHYS 108", 3, false);
        Course phys109 = new Course("PHYS 109", 3, false);
        Course phys117 = new Course("PHYS 117", 3, false);
        Course phys118 = new Course("PHYS 118", 3, false);
        Course phys119 = new Course("PHYS 119", 1, false);
        Collections.addAll(physCourses, phys101, phys107, phys108, phys109, phys117, phys118, phys119);
        allCourses.addAll(physCourses);
    }

    public List<Course> getPhysicsCourses() {
        return physCourses;
    }

    private void makeStatisticsCourses() {
        Course stat200 = new Course("STAT 200", 3, false);
        Course stat203 = new Course("STAT 203", 3, false);
        Course stat251 = new Course("STAT 251", 3, false);
        Course stat300 = new Course("STAT 300", 3, true);
        Course stat302 = new Course("STAT 302", 3, true);
        Course stat305 = new Course("STAT 305", 3, true);
        Course stat306 = new Course("STAT 306", 3, true);
        Collections.addAll(statCourses, stat200, stat203, stat251, stat300, stat302, stat305, stat306);
        allCourses.addAll(statCourses);
    }

    public List<Course> getStatisticsCourses() {
        return statCourses;
    }

}
