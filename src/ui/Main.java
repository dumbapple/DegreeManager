package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        // Object initialization
        ApplicationState thisProgram = new ApplicationState();
        Scanner userInput = thisProgram.getInput();
        Faculty facultyOfScience = thisProgram.getFaculty();
        Student user = thisProgram.getStudent();
        StudentManager manager = user.getStudentManager();
        Transcript userTranscript = new Transcript(user);
        user.setTranscript(userTranscript);

        // User setup
        manager.printGreetingMessage();
        manager.logProfileInformation(userInput);

        // Main program loop
        while (thisProgram.isRunning()) {
            manager.printMainMenu();
            // Reading menu selection
            switch (userInput.nextLine()) {
                // Case where user accesses their profile
                case "1":
                    manager.printProfile();
                    manager.printMenuOptionsCaseOne();
                    switch (userInput.nextLine()) {
                        case "change":
                            manager.handleSpecializationChange(userInput);
                            manager.printProfile();
                            break;
                        case "main":
                            continue;
                        case "quit":
                            thisProgram.setOver();
                            System.exit(0);
                    }
                    break;
                // Case where user accesses their transcript
                case "2":
                    if (user.getCoursesTaken().isEmpty()) {
                        manager.printNoCoursesTakenMessage();
                        manager.generateTranscript(userInput);
                    } else {
                        userTranscript.display();
                    }
                    manager.printMenuOptionsCaseTwo();
                    switch (userInput.nextLine()) {
                        case "more":
                            System.out.println("Enter a subject code (eg. CHEM, BIOL, CPSC).");
                            manager.generateTranscript(userInput);
                        case "main":
                            continue;
                        case "quit":
                            thisProgram.setOver();
                            System.exit(0);
                    }
                    break;
                // Case where user accesses their degree progress
                case "3":
                    if (user.getCoursesTaken().isEmpty()) {
                        // Send user to add courses first
                        manager.redirectUser(userInput);
                        manager.printDegreeProgress(facultyOfScience);
                    } else {
                        manager.printDegreeProgress(facultyOfScience);
                    }
                    break;
                case "quit":
                    thisProgram.setOver();
                    System.exit(0);
            }
        }
    }
}
