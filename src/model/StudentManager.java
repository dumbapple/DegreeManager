package model;

import java.util.List;
import java.util.Scanner;

// Manages changes and information output for a given student's studies
public class StudentManager {
    private Student managee;
    private CourseCatalogue courseCatalogue;


    StudentManager(Student managee) {
        this.managee = managee;
        courseCatalogue = new CourseCatalogue();
    }

    public CourseCatalogue getCourseCatalogue() {
        return courseCatalogue;
    }

    public void generateTranscript(Scanner studentInput) {
        switch (studentInput.next()) {
            case "BIOL":
                logCourseAndGrade(studentInput, courseCatalogue.getBiologyCourses());
                break;
            case "CHEM":
                logCourseAndGrade(studentInput, courseCatalogue.getChemistryCourses());
                break;
            case "CPSC":
                logCourseAndGrade(studentInput, courseCatalogue.getComputerScienceCourses());
                break;
            case "ENGL":
                logCourseAndGrade(studentInput, courseCatalogue.getEnglishCourses());
                break;
            case "MATH":
                logCourseAndGrade(studentInput, courseCatalogue.getMathCourses());
                break;
            case "PHYS":
                logCourseAndGrade(studentInput, courseCatalogue.getPhysicsCourses());
                break;
            case "STAT":
                logCourseAndGrade(studentInput, courseCatalogue.getStatisticsCourses());
                break;
        }
    }

    private void printCourseList(List<Course> coursesToDisplay) {
        System.out.println("\n" + "\n" + "\n" + "COURSE LIST");
        System.out.println("--------------------------------------");
        for (Course c : coursesToDisplay) {
            if (!managee.getCoursesTaken().contains(c)) {
                System.out.println(c.getName());
            }
        }
    }

    public void printGreeting() {
        System.out.println("WELCOME TO THE UBC DEGREE MANAGER!");
        System.out.println("==================================");
        System.out.println("To begin, I'll get you to enter some information about yourself.");
    }

    public void printEmptyTranscriptMessages() {
        System.out.println("\n" + "\n" + "\n" + "Oh no! It looks like we have no information about your course history!");
        System.out.println("You'll have to browse and add the ones you've taken into our system.");
        System.out.println("View a subject's courses by entering its abbreviation below (case-sensitive, eg. CHEM, BIOL, CPSC).");
    }

    public void printMenuOptions() {
        System.out.println("\n" + "Enter 'main' to return to the main menu");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void printMainMenu() {
        System.out.println("\n" + "\n" + "\n" + "MAIN MENU");
        System.out.println("--------------------------------------");
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to view your overall degree progress");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void printProfile() {
        System.out.println("\n" + "\n" + "\n" + "PROFILE");
        System.out.println("--------------------------------------");
        System.out.println("Name: " + managee.getName());
        System.out.println("UBC ID: " + managee.getID());
        System.out.println("Year level: " + managee.getStudyYear());
        System.out.println("Specialization: " + managee.getSpecialization().getName());
        System.out.println("Honours: " + managee.isHonours());
    }

    public void displayDegreeProgress(Faculty faculty) {
        System.out.println("\n" + "\n" + "\n" + "DEGREE PROGRESS");
        System.out.println("--------------------------------------");
        printArtsProgress(faculty);
        printScienceProgress(faculty);
        printUpperYearProgress(faculty);
        printUpperYearScienceProgress(faculty);
    }

    private void printArtsProgress(Faculty faculty) {
        int creditsEarned = managee.getTranscript().sumConditionalCredits(courseCatalogue.getArtsCourses());
        System.out.println("Arts requirement: " + creditsEarned + "/" + faculty.getArtsCredits() + " credits completed");
    }

    private void printScienceProgress(Faculty faculty) {
        int creditsEarned = managee.getTranscript().sumConditionalCredits(courseCatalogue.getScienceCourses());
        System.out.println("Science requirement: " + creditsEarned + "/" + faculty.getScienceCredits() + " credits completed");
    }

    private void printUpperYearProgress(Faculty faculty) {
        int creditsEarned = managee.getTranscript().sumConditionalCredits(courseCatalogue.getUpperYearCourses());
        System.out.println("Upper-level requirement: " + creditsEarned + "/" + faculty.getUpperLevelTotalCredits() + " credits completed");
    }

    private void printUpperYearScienceProgress(Faculty faculty) {
        int creditsEarned = managee.getTranscript().sumConditionalCredits(courseCatalogue.getUpperYearScienceCourses());
        System.out.println("Upper-level Science requirement: " + creditsEarned + "/" + faculty.getUpperLevelScienceCredits() + " credits completed");
    }

    public void redirectUser(Scanner input) {
        System.out.println("Looks like we don't have any info about your courses yet." +
                " Enter 'add' to log your course information with the system");
        if (input.next().equals("add")) {
            System.out.println("Enter a subject abbreviation to begin adding courses to your transcript");
            generateTranscriptCaseThree(input);
        }
    }

    private void logCourseAndGrade(Scanner studentInput, List<Course> courseList) {
        boolean canLoopRun = true;
        while (canLoopRun) {
            studentInput.nextLine();
            printCourseList(courseList);
            System.out.println("Enter a course from this list that you've taken (case-sensitive!)");
            logCourseTaken(courseList, studentInput);
            if (!willAddMoreFromSubject(studentInput)) {
                canLoopRun = false;
            }
        }
    }

    private void logCourseAndGradeCaseThree(Scanner studentInput, List<Course> courseList) {
        boolean canLoopRun = true;
        while (canLoopRun) {
            studentInput.nextLine();
            printCourseList(courseList);
            System.out.println("Enter a course from this list that you've taken (case-sensitive!)");
            logCourseTaken(courseList, studentInput);
            if (!willAddMoreFromSubjectCaseThree(studentInput)) {
                canLoopRun = false;
            }
        }
    }

    private void logCourseTaken(List<Course> courses, Scanner sc) {
        String chosenCourse = sc.nextLine();
        for (Course c : courses) {
            if (c.getName().equals(chosenCourse)) {
                managee.getCoursesTaken().add(c);
                System.out.println("Enter grade received:");
                int gradeReceived = sc.nextInt();
                c.setGrade(gradeReceived);
            }
        }
    }

    private String logName(Scanner scanner) {
        System.out.println("\n" + "Please enter your first and last name:");
        return scanner.nextLine();
    }

    private int logStudentID(Scanner scanner) {
        System.out.println("\n" + "Please enter your UBC student number:");
        return Integer.parseInt(scanner.next());
    }

    private int logStudyYear(Scanner scanner) {
        System.out.println("\n" + "Please enter your study year:");
        return Integer.parseInt(scanner.next());
    }

    private Specialization logSpecialization(Scanner scanner) {
        System.out.println("\n" + "Please enter your specialization as abbreviated on the SSC (eg. BIOL, CHEM, CPSC):");
        return new Specialization(scanner.next());
    }

    private boolean logHonoursStatus(Scanner scanner) {
        System.out.println("\n" + "You are in a honours program (true/false): ");
        return Boolean.parseBoolean(scanner.next());
    }

    private boolean willAddMoreFromSubject(Scanner input) {
        boolean result = false;
        System.out.println("Add more courses from this subject? ('yes'/'no')");
        if (input.next().equals("no")) {
            System.out.println("If you have finished adding your courses, enter 'done'. Otherwise, enter 'more'");
            switch (input.next()) {
                case "done":
                    System.out.println("\n" + "Thanks for taking the time to do this. Here is your transcript:");
                    managee.getTranscript().display();
                    break;
                case "more":
                    System.out.println("Enter another subject abbreviation (case-sensitive)");
                    generateTranscript(input);
                    break;
            }
        } else {
            result = true;
        }
        return result;
    }

    public void registerProfileInformation(Scanner studentInput) {
        managee.setName(logName(studentInput));
        managee.setSchoolID(logStudentID(studentInput));
        managee.setStudyYear(logStudyYear(studentInput));
        managee.setSpecialization(logSpecialization(studentInput));
        managee.setHonours(logHonoursStatus(studentInput));
    }

    public void generateTranscriptCaseThree(Scanner studentInput) {
        switch (studentInput.next()) {
            case "BIOL":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getBiologyCourses());
                break;
            case "CHEM":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getChemistryCourses());
                break;
            case "CPSC":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getComputerScienceCourses());
                break;
            case "ENGL":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getEnglishCourses());
                break;
            case "MATH":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getMathCourses());
                break;
            case "PHYS":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getPhysicsCourses());
                break;
            case "STAT":
                logCourseAndGradeCaseThree(studentInput, courseCatalogue.getStatisticsCourses());
                break;
        }
    }

    private boolean willAddMoreFromSubjectCaseThree(Scanner input) {
        boolean result = false;
        System.out.println("Add more courses from this subject? ('yes'/'no')");
        if (input.next().equals("no")) {
            System.out.println("If you have finished adding your courses, enter 'done'. Otherwise, enter 'more'");
            switch (input.next()) {
                case "done":
                    System.out.println("\n" + "Thanks for taking the time to do this. Your degree progress summary:");
                    break;
                case "more":
                    System.out.println("Enter another subject abbreviation (case-sensitive)");
                    generateTranscript(input);
                    break;
            }
        } else {
            result = true;
        }
        return result;
    }

}

