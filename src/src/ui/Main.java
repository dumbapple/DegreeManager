package ui;

import model.*;
import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Degree Manager!");
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        StudentManager userManager = user.getStudentManager();
        CourseCatalogue catalogue = userManager.getCourseCatalogue();


        // Grabbing user info
        userManager.gatherStudentInformation(input);

        // Running application

        while (userManager.isRunning()) {
            userManager.showMainMenu();

            switch (input.next()) {
                case "1":
                    userManager.showProfileInfo();
                    break;
                case "2":
                    if (user.getCoursesTaken().isEmpty()) {
                        userManager.printEmptyTranscriptMessages();
                        switch (input.next()) {
                            case "BIOL":
                                userManager.displayCourses(catalogue.getBiologyCourses());
                                break;
                            case "CHEM":
                                userManager.displayCourses(catalogue.getChemistryCourses());
                                break;
                            case "CPSC":
                                userManager.displayCourses(catalogue.getComputerScienceCourses());
                                break;
                            case "ENGL":
                                userManager.displayCourses(catalogue.getEnglishCourses());
                                break;
                            case "MATH":
                                userManager.displayCourses(catalogue.getMathCourses());
                                break;
                            case "PHYS":
                                userManager.displayCourses(catalogue.getPhysicsCourses());
                                break;
                            case "STAT":
                                userManager.displayCourses(catalogue.getStatisticsCourses());
                                break;
                        }
                    }

                    // do course-related stuff here
                    break;
                case "3":
                    System.out.println("3!!!");
                    break;
                case "quit":
                    userManager.setOver();
                    System.exit(0);
            }
            userManager.printMenuChangeMessages();
            switch (input.next()) {
                case "back":
                    break;
                case "quit":
                    userManager.setOver();
                    break;
            }
        }
    }
}
