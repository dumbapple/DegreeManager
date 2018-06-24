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
                    } else {
                        System.out.println("FUCK");
                        // TODO: do the other functionality here
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
