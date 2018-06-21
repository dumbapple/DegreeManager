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
        userManager.registerStudentInformation(input);
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
                                System.out.println("Type in a course from this list to log your grade");
                                System.out.println("Type 'back' to return to previous menu");
                                String selectedCourse = input.next();
                                System.out.println(selectedCourse);

                                for (Course c : catalogue.getBiologyCourses()) {
                                    if (c.getName().equals(selectedCourse)) {
                                        user.getCoursesTaken().add(c);
                                        System.out.println("Enter grade received, rounded to nearest percent:");
                                        Integer gradeOfChosenCourse = input.nextInt();
                                        c.setGrade(gradeOfChosenCourse);
                                        System.out.println(c.getCredit());
                                    }
                                }

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
