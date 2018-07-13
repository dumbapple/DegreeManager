package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        ApplicationState thisProgram = new ApplicationState();

        Scanner userInput = thisProgram.getInput();

        Faculty facultyOfScience = thisProgram.getFaculty();

        Student user = thisProgram.getStudent();

        StudentManager manager = user.getStudentManager();

        Transcript userTranscript = new Transcript(user);

        user.setTranscript(userTranscript);

        manager.printGreetingMessage();

        manager.logProfileInformation(userInput);

        while (thisProgram.isRunning()) {
            manager.printMainMenu();
            switch (userInput.nextLine()) {
                case "1":
                    manager.printProfile();
                    manager.printMenuOptionsCaseOne();

                    switch (userInput.nextLine()) {
                        case "change":
                            manager.handleSpecializationChange(userInput);
                            break;
                        case "main":
                            continue;
                        case "quit":
                            thisProgram.setOver();
                            break;
                    }


                    break;
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
                            System.out.println("Enter a subject code (eg. CHEM).");
                            manager.generateTranscript(userInput);
                        case "main":
                            continue;
                        case "quit":
                            thisProgram.setOver();
                            break;
                    }
                    break;
                case "3":
                    if (user.getCoursesTaken().isEmpty()) {
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
//            manager.printMenuOptionsGeneral();
//            switch (userInput.next()) {
//                case "main":
//                    continue;
//                case "quit":
//                    thisProgram.setOver();
//                    break;
//            }
        }
    }
}
