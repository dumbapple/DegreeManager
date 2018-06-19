package ui;

import model.*;
import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {


        System.out.println("Enroll in some courses!");


        // Grabbing user info
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        StudentManager userManager = user.getStudentManager();
        CourseManager courseManager = userManager.getCourseManager();
        userManager.gatherStudentInformation(input);

        // Running the application

        while (userManager.isRunning()) {
            userManager.showMainMenu();

            switch (input.next()) {
                case "1":
                    userManager.showProfileInfo();
                    break;
                case "2":

                    System.out.println("For the following, ");

                    break;
                case "3":
                    System.out.println("3!!!");
                    break;
                case "quit":
                    userManager.setOver();
                    System.exit(0);
            }
            System.out.println("Enter 'back' to return to the main menu");
            System.out.println("Enter 'quit' to exit the application");
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
