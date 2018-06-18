package ui;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // grabbing user info
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Degree Manager! Please enter your first and last name:");
        String inputFullName = userInput.nextLine();
        System.out.println("Please enter your UBC student number:");
        String inputStudentID = userInput.nextLine();
        System.out.println("Please enter your year of study:");
        String inputStudyYear = userInput.next();
        System.out.println("Please enter your specialization as abbreviated on the SSC (eg. BIOL, CHEM, CPSC):");
        String inputSpecialization = userInput.next();

        // initializing student and application
        int studentID = Integer.parseInt(inputStudentID);
        int studyYear = Integer.parseInt(inputStudyYear);
        Specialization thisSpecialization = new Specialization(inputSpecialization);
        Student thisUser = new Student(inputFullName, studentID, studyYear, thisSpecialization);
        StudentManager thisManager = new StudentManager(thisUser);
        ApplicationState thisProgram = new ApplicationState(thisManager);

        // creating & grouping some courses
        List<Course> firstYearCourses = new ArrayList<>();
        Course engl110 = new Course("ENGL 110", 3);
        Course engl112 = new Course("ENGL 112", 3);
        Course math100 = new Course("MATH 100", 3);
        Course math101 = new Course("MATH 101", 3);
        Course cpsc110 = new Course("CPSC 110", 4);
        Course cpsc121 = new Course("CPSC 121", 4);
        Course chem121 = new Course("CHEM 121", 4);
        Course chem123 = new Course("CHEM 123", 4);
        Course phys101 = new Course("PHYS 101", 3);
        Collections.addAll(firstYearCourses, engl110, engl112, math100, math101, cpsc110, cpsc121, chem121, chem123, phys101);

        // running the application
        while (thisProgram.isRunning()) {
            thisManager.showMainMenu();

            switch (userInput.next()) {
                case "1":
                    thisManager.showProfileInfo();
                    break;
                case "2":
                    System.out.println("2!!!");
                    break;
                case "3":
                    System.out.println("3!!!");
                    break;
            }
            System.out.println("Enter 'back' to return to the main menu");
            System.out.println("Enter 'quit' to exit the application");

            switch (userInput.next()) {
                case "back":
                    break;
                case "quit":
                    thisProgram.setOver();
                    break;
            }
        }
    }
}
