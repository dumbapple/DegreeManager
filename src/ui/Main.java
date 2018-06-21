package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Degree Manager!");
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        StudentManager manager = user.getStudentManager();
        CourseCatalogue catalogue = manager.getCourseCatalogue();

//        System.out.println(catalogue.getBiologyCourses());

        manager.registerStudentInformation(input);

        while (manager.isRunning()) {
            manager.showMainMenu();
            switch (input.next()) {
                case "1":
                    manager.showProfileInfo();
                    break;
                case "2":
                    if (user.getCoursesTaken().isEmpty()) {
                        manager.printEmptyTranscriptMessages();
                        manager.registerCourseAndGrade(input);
                    } else {
                        System.out.println("Hello");
                    }
                    // do course-related stuff here
                    break;
                case "3":
                    System.out.println("3!!!");
                    break;
                case "quit":
                    manager.setOver();
                    System.exit(0);
            }
            manager.printMenuSwitchOptions();
            switch (input.next()) {
                case "main":
                    continue;
                case "quit":
                    manager.setOver();
                    break;
            }
        }
    }
}
