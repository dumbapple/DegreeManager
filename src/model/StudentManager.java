package model;

import java.util.List;
import java.util.Scanner;

// Manages changes and information output for a given student's studies
public class StudentManager {
    private boolean isRunning;
    private Student managee;
    private CourseCatalogue courseCatalogue;


    public StudentManager(Student managee) {
        isRunning = true;
        this.managee = managee;
        courseCatalogue = new CourseCatalogue();
    }

    public void showMainMenu() {
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to view your overall degree progress");
        System.out.println("Enter 'quit' to exit the application");
    }
    public void showProfileInfo() {
        System.out.println("Name: " + managee.getName());
        System.out.println("UBC ID: " + managee.getID());
        System.out.println("Year level: " + managee.getStudyYear());
        System.out.println("Specialization: " + managee.getSpecialization().getName());
        System.out.println("Honours: " + managee.isHonours());
    }
    public void registerStudentInformation(Scanner studentInput) {
        managee.setName(logName(studentInput));
        managee.setSchoolID(logStudentID(studentInput));
        managee.setStudyYear(logStudyYear(studentInput));
        managee.setSpecialization(logSpecialization(studentInput));
        managee.setHonours(logHonoursStatus(studentInput));
    }


    public void registerCourseAndGrade(Scanner studentInput) {
        switch (studentInput.next()) {
            case "BIOL":
                logCourseAndGrade(studentInput, courseCatalogue.getBiologyCourses());
                studentInput.nextLine();
                break;
            case "CHEM":
                logCourseAndGrade(studentInput, courseCatalogue.getChemistryCourses());
                studentInput.nextLine();
                break;
            case "CPSC":
                logCourseAndGrade(studentInput, courseCatalogue.getComputerScienceCourses());
                studentInput.nextLine();
                break;
            case "ENGL":
                logCourseAndGrade(studentInput, courseCatalogue.getEnglishCourses());
                studentInput.nextLine();
                break;
            case "MATH":
                logCourseAndGrade(studentInput, courseCatalogue.getMathCourses());
                studentInput.nextLine();
                break;
            case "PHYS":
                logCourseAndGrade(studentInput, courseCatalogue.getPhysicsCourses());
                studentInput.nextLine();
                break;
            case "STAT":
                logCourseAndGrade(studentInput, courseCatalogue.getStatisticsCourses());
                studentInput.nextLine();
                break;
            case "done":
                System.out.println("Thank you for feeding us this info. Here is your transcript:");
                break;
        }
    }
    public void printTranscript() {
        for (Course c : managee.getCoursesTaken()) {
            System.out.println("Course: " + c.getName() + "   " + "Grade: " + c.getGrade() + "   " + "Credit: " + c.getCredit() );
        }
    }

    public void printEmptyTranscriptMessages() {
        System.out.println("It looks like we don't know anything about the courses you've taken");
        System.out.println("Browse through our course catalogues and log the ones you've taken");
        System.out.println("View a subject's course list by entering its abbreviation (eg. CHEM, BIOL, CPSC)");
    }
    public void printMenuSwitchOptions() {
        System.out.println("Enter 'main' to return to the main menu");
        System.out.println("Enter 'quit' to exit the application");
    }
    public boolean isRunning() {
        return isRunning;
    }
    public CourseCatalogue getCourseCatalogue() {
        return courseCatalogue;
    }
    public void setOver() {
        System.out.println("Goodbye!");
        isRunning = false;
    }
    private void logCourseAndGrade(Scanner studentInput, List<Course> courseList) {
        boolean canLoopRun = true;
        studentInput.nextLine();
        while (canLoopRun) {
            displayCourses(courseList);
            System.out.println("Enter a course from this list that you've taken");
            String chosenCourse = studentInput.nextLine();
            for (Course c : courseList) {
                if (c.getName().equals(chosenCourse)) {
                    managee.getCoursesTaken().add(c);
                    System.out.println("Enter grade received:");
                    int gradeReceived = studentInput.nextInt();
                    c.setGrade(gradeReceived);
                    System.out.println(c.getName() + ": " + c.getGrade() + "%");
                }
            }
            System.out.println("Add more courses from this subject? ('yes'/'no')");
            if (studentInput.next().equals("no")) {
                canLoopRun = false;
                System.out.println("Enter another subject abbreviation to browse its courses");
                System.out.println("If finished, enter 'done'");
                registerCourseAndGrade(studentInput);
            } else {
                studentInput.nextLine();
            }
        }
    }
    private void displayCourses(List<Course> coursesToDisplay) {
        for (Course c : coursesToDisplay) {
            if (!managee.getCoursesTaken().contains(c)) {
                System.out.println(c.getName());
            }
        }
    }
    private String logName(Scanner scanner) {
        System.out.println("Please enter your first and last name:");
        return scanner.nextLine();
    }
    private int logStudentID(Scanner scanner) {
        System.out.println("Please enter your UBC student number:");
        return Integer.parseInt(scanner.next());
    }
    private int logStudyYear(Scanner scanner) {
        System.out.println("Please enter your study year:");
        return Integer.parseInt(scanner.next());
    }
    private Specialization logSpecialization(Scanner scanner) {
        System.out.println("Please enter your specialization as abbreviated on the SSC (eg. BIOL, CHEM, CPSC):");
        return new Specialization(scanner.next());
    }
    private boolean logHonoursStatus(Scanner scanner) {
        System.out.println("You are in a honours program (true/false): ");
        return Boolean.parseBoolean(scanner.next());
    }
}

