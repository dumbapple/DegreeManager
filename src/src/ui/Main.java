package ui;

import model.*;
import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {

        // Creating & grouping some courses
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

        List<Course> secondYearCourses = new ArrayList<>();
        Course cpsc210 = new Course("CPSC 110", 4);
        Course cpsc213 = new Course("CPSC 121", 4);
        Course cpsc221 = new Course("CPSC 110", 4);
        Course stat200 = new Course("STAT 200", 3);
        Course stat302 = new Course("STAT 302", 3);
        Course math200 = new Course("MATH 200", 3);
        Course math220 = new Course("MATH 220", 3);
        Course math221 = new Course("MATH 221", 3);
        Collections.addAll(secondYearCourses, cpsc210, cpsc213, cpsc221, stat200, stat302, math200, math220, math221);

        // Grabbing user info
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        user.gatherStudentInformation(input);
        StudentManager manager = user.getManager();

        // Running the application
        AppRunner thisProgram = new AppRunner();
        while (thisProgram.isRunning()) {
            manager.showMainMenu();
            switch (input.next()) {
                case "1":
                    manager.showProfileInfo();
                    break;
                case "2":
                    System.out.println("2!!!");
                    break;
                case "3":
                    System.out.println("3!!!");
                    break;
                case "quit":
                    thisProgram.setOver();
                    System.exit(0);
            }
            System.out.println("Enter 'back' to return to the main menu");
            System.out.println("Enter 'quit' to exit the application");
            switch (input.next()) {
                case "back":
                    break;
                case "quit":
                    thisProgram.setOver();
                    break;
            }
        }
    }
}
