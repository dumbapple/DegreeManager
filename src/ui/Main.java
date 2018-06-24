package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        ApplicationState thisProgram = new ApplicationState();

        Scanner input = thisProgram.getInput();
        Faculty scienceFaculty = thisProgram.getFaculty();
        Student user = thisProgram.getStudent();
        StudentManager manager = user.getStudentManager();
        Transcript userTranscript = new Transcript(user);
        user.setTranscript(userTranscript);
        manager.printGreeting();
        manager.registerProfileInformation(input);

        while (thisProgram.isRunning()) {
            manager.printMainMenu();
            switch (input.next()) {
                case "1":
                    manager.printProfile();
                    break;
                case "2":
                    if (user.getCoursesTaken().isEmpty()) {
                        manager.printEmptyTranscriptMessages();
                        manager.generateTranscript(input);
                    } else {
                        userTranscript.display();
                    }
                    break;
                case "3":
                    if (user.getCoursesTaken().isEmpty()) {
                        manager.redirectUser(input);
                        System.out.println("\n" + "\n" + "\n" + "You may now view your degree progress.");
                        manager.displayDegreeProgress(scienceFaculty);
                    } else {
                        manager.displayDegreeProgress(scienceFaculty);
                    }
                    break;
                case "quit":
                    thisProgram.setOver();
                    System.exit(0);
            }
            manager.printMenuOptions();
            switch (input.next()) {
                case "main":
                    continue;
                case "quit":
                    thisProgram.setOver();
                    break;
            }
        }
    }
}
