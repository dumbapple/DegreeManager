package model;

import java.util.List;
import java.util.Scanner;

// Manages changes and information output for a given student's studies
public class StudentManager {
    private Student student;
    private CourseCatalogue courseList;

    StudentManager(Student student) {
        this.student = student;
        courseList = new CourseCatalogue();
    }

public void handleSpecializationChange(Scanner sc) {

    System.out.println("\n" + "Change specialization? ('yes'/'no')");
    if (sc.next().equals("yes")) {
        sc.nextLine();
        System.out.println("Enter your new specialization's abbreviation code");
        student.setSpec(sc.next());
        System.out.println("Your specialization has been updated.");
    }
}
    private boolean isUserAddingMore(Scanner input) {
        boolean result = true;
        System.out.println("Add more courses from this subject? ('yes'/'no')");
        if (input.next().equals("no")) {
            result = false;
            System.out.println("If you are done adding courses, enter 'done'.");
            System.out.println("Otherwise, enter 'more'.");
            switch (input.next()) {
                case "done":
                    student.getTranscript().display();
                    break;
                case "more":
                    System.out.println("Enter another subject abbreviation (case-sensitive):");
                    generateTranscript(input);
                    break;
            }
        }
        return result;
    }

    private boolean isUserAddingMoreCaseThree(Scanner input) {
        boolean result = true;
        System.out.println("Add more courses from this subject? ('yes'/'no')");
        if (input.next().equals("no")) {
            result = false;
            System.out.println("If you are done courses, enter 'done'.");
            System.out.println("Otherwise, enter 'more'.");
            switch (input.next()) {
                case "done":
                    System.out.println("\n" + "Thanks for your help. Your degree progress:");
                    break;
                case "more":
                    System.out.println("Enter another subject abbreviation (case-sensitive)");
                    generateTranscriptCaseThree(input);
                    break;
            }
        }
        return result;
    }

    public void generateTranscript(Scanner studentInput) {
        switch (studentInput.next()) {
            case "BIOL":
                logCourseAndGrade(studentInput, courseList.getBiologyCourses());
                break;
            case "CHEM":
                logCourseAndGrade(studentInput, courseList.getChemistryCourses());
                break;
            case "CPSC":
                logCourseAndGrade(studentInput, courseList.getComputerScienceCourses());
                break;
            case "ENGL":
                logCourseAndGrade(studentInput, courseList.getEnglishCourses());
                break;
            case "MATH":
                logCourseAndGrade(studentInput, courseList.getMathCourses());
                break;
            case "PHYS":
                logCourseAndGrade(studentInput, courseList.getPhysicsCourses());
                break;
            case "STAT":
                logCourseAndGrade(studentInput, courseList.getStatisticsCourses());
                break;
        }
    }

    private void generateTranscriptCaseThree(Scanner studentInput) {
        switch (studentInput.next()) {
            case "BIOL":
                logCourseAndGradeCaseThree(studentInput, courseList.getBiologyCourses());
                break;
            case "CHEM":
                logCourseAndGradeCaseThree(studentInput, courseList.getChemistryCourses());
                break;
            case "CPSC":
                logCourseAndGradeCaseThree(studentInput, courseList.getComputerScienceCourses());
                break;
            case "ENGL":
                logCourseAndGradeCaseThree(studentInput, courseList.getEnglishCourses());
                break;
            case "MATH":
                logCourseAndGradeCaseThree(studentInput, courseList.getMathCourses());
                break;
            case "PHYS":
                logCourseAndGradeCaseThree(studentInput, courseList.getPhysicsCourses());
                break;
            case "STAT":
                logCourseAndGradeCaseThree(studentInput, courseList.getStatisticsCourses());
                break;
        }
    }

    public void redirectUser(Scanner input) {
        printNoCoursesTakenMessage();
        generateTranscriptCaseThree(input);
    }

    private void printArtsProgress(Faculty faculty) {
        int credits = student.getTranscript().sumCondCredits(courseList.getArts());
        System.out.println("ARTS: " + credits + "/" + faculty.getArtsCred());
    }

    private void printCourseList(List<Course> coursesToDisplay) {
        System.out.println("\n" + "\n" + "\n");
        System.out.println("COURSE LIST");
        System.out.println("--------------------------------------");
        for (Course c : coursesToDisplay) {
            if (!student.getCoursesTaken().contains(c)) {
                System.out.println(c.getName());
            }
        }
    }

    public void printDegreeProgress(Faculty faculty) {
        System.out.println("\n" + "\n" + "\n");
        System.out.println("DEGREE PROGRESS");
        System.out.println("--------------------------------------");
        printArtsProgress(faculty);
        printScienceProgress(faculty);
        printUpperYearProgress(faculty);
        printUpperYearScienceProgress(faculty);
        int max = faculty.getMaxCreditsAllowed();
        int current = student.getTranscript().sumAllCredits(student.getCoursesTaken());
        int remaining = max - current;
        System.out.println("You must complete your studies within " + remaining + " credit attempts.");
    }

    public void printGreetingMessage() {
        System.out.println("WELCOME TO THE UBC DEGREE MANAGER!");
        System.out.println("==================================");
    }

    public void printMainMenu() {
        System.out.println("\n" + "\n" + "\n");
        System.out.println("MAIN MENU");
        System.out.println("--------------------------------------");
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to track your degree progress");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void printMenuOptionsGeneral() {
        System.out.println("\n" + "Enter 'main' to return to the main menu");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void printMenuOptionsCaseTwo() {
        System.out.println("\n" + "Enter 'more' to register more courses");
        System.out.println("Enter 'main' to return to the main menu");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void printNoCoursesTakenMessage() {
        System.out.println("\n" + "\n" + "\n");
        System.out.println("Oh rats! We have no info regarding your courses!");
        System.out.println("You must browse and add courses you've taken.");
        System.out.println("Enter a subject code (eg. CHEM, BIOL, CPSC).");
    }

    public void printProfile() {
        System.out.println("\n" + "\n" + "\n");
        System.out.println("PROFILE");
        System.out.println("--------------------------------------");
        System.out.println("Name: " + student.getName());
        System.out.println("UBC ID: " + student.getID());
        System.out.println("Year level: " + student.getStudyYear());
        System.out.println("Specialization: " + student.getSpec());
        System.out.println("Honours: " + student.isHonours());
    }

    private void printScienceProgress(Faculty faculty) {
        int credits = student.getTranscript().sumCondCredits(courseList.getScie());
        System.out.println("SCIE: " + credits + "/" + faculty.getScienceCred());
    }

    private void printUpperYearProgress(Faculty faculty) {
        int credits = student.getTranscript().sumCondCredits(courseList.getUpperYr());
        System.out.println("Upper-yr: " + credits + "/" + faculty.getUpYrCred());
    }

    private void printUpperYearScienceProgress(Faculty faculty) {
        int credits = student.getTranscript().sumCondCredits(courseList.getUpYrScie());
        System.out.println("Upper-yr SCIE: " + credits + "/" + faculty.getUpYrScienceCred());
    }

    private void logCourseAndGrade(Scanner studentInput, List<Course> courseList) {
        boolean canLoopRun = true;
        while (canLoopRun) {
            studentInput.nextLine();
            printCourseList(courseList);
            System.out.println("Enter a course you've taken (case-sensitive!)");
            extractCourseDetails(courseList, studentInput);
            if (!isUserAddingMore(studentInput)) {
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
            extractCourseDetails(courseList, studentInput);
            if (!isUserAddingMoreCaseThree(studentInput)) {
                canLoopRun = false;
            }
        }
    }

    private void extractCourseDetails(List<Course> courses, Scanner sc) {
        String chosenCourse = sc.nextLine();
        for (Course c : courses) {
            if (c.getName().equals(chosenCourse)) {
                student.getCoursesTaken().add(c);
                System.out.println("Enter grade received:");
                int gradeReceived = sc.nextInt();
                c.setGrade(gradeReceived);
            }
        }
    }

    private boolean logHonoursStatus(Scanner scanner) {
        System.out.println("\n");
        System.out.println("You are in honours (true/false):");
        return Boolean.parseBoolean(scanner.next());
    }

    private String logName(Scanner scanner) {
        System.out.println("\n");
        System.out.println("Enter your first and last name:");
        return scanner.nextLine();
    }

    public void logProfileInformation(Scanner studentInput) {
        student.setName(logName(studentInput));
        student.setSchoolID(logStudentID(studentInput));
        student.setStudyYear(logStudyYear(studentInput));
        student.setSpecialization(logSpecialization(studentInput));
        student.setHonours(logHonoursStatus(studentInput));
    }

    private String logSpecialization(Scanner scanner) {
        System.out.println("\n");
        System.out.println("Enter your major as abbreviated on the SSC (eg. CHEM):");
        return scanner.next();
    }

    private int logStudentID(Scanner scanner) {
        System.out.println("\n");
        System.out.println("Enter your UBC student number:");
        return Integer.parseInt(scanner.next());
    }

    private int logStudyYear(Scanner scanner) {
        System.out.println("\n");
        System.out.println("Enter your study year:");
        return Integer.parseInt(scanner.next());
    }
}

