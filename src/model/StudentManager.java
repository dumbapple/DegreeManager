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

    public void displayCourses(List<Course> coursestoDisplay) {
        Course placeholder = new Course("", 0);
        coursestoDisplay.add(0, placeholder);
        for (int index = 1; index < coursestoDisplay.size(); index++) {
            System.out.println(index + ". " + coursestoDisplay.get(index).getName());
        }
    }

    public void printEmptyTranscriptMessages() {
        System.out.println("Oh no! It looks like we don't yet have any information about the courses you've taken");
        System.out.println("You must browse through our course catalogues and log the ones you've taken");
        System.out.println("View a subject's full course list by entering its abbreviation on the SSC (eg. CHEM, BIOL, CPSC)");
    }
    public void printMenuChangeMessages() {
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

