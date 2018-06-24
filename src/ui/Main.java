package ui;

import model.*;

import java.util.*;

// Main code that runs application
public class Main {
    public static void main(String[] args) {
        // Greeting and object setup
        System.out.println("Welcome to the Degree Manager!");
        Scanner input = new Scanner(System.in);
        Student user = new Student();
        StudentManager manager = user.getStudentManager();


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
                        manager.printTranscript();
                    }
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
