package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE UBC DEGREE MANAGER!");
        System.out.println("==================================");
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        Transcript userTranscript = new Transcript(user);
        user.setTranscript(userTranscript);
        StudentManager manager = user.getStudentManager();
        Faculty scienceFaculty = new Faculty("Science");
        System.out.println("To begin, I'll get you to enter some information about yourself.");
        manager.registerProfileInformation(input);

        while (manager.isRunning()) {
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
                        System.out.println("Enter 'progress' to continue.");
                        if (input.next().equals("progress")) {
                            System.out.println("GAY");
                        }
                    } else {
                        manager.displayDegreeProgress(scienceFaculty);
                    }
                    break;
                case "quit":
                    manager.setOver();
                    System.exit(0);
            }
            manager.printMenuOptions();
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
