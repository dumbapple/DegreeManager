package ui;

import model.ApplicationState;
import model.Specialization;
import model.Student;
import model.StudentManager;

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
        Specialization specialization = new Specialization(inputSpecialization);
        specialization.
        Student thisUser = new Student(inputFullName, specialization, studentID, studyYear);
        StudentManager thisManager = new StudentManager(thisUser);
        ApplicationState thisProgram = new ApplicationState(thisManager);

        thisManager.showMainMenu();

        while (thisProgram.isRunning()) {
            if (userInput.next().equals("1")) {
                thisManager.showProfileInfo();
            }

            if (userInput.next().equals("2")) {
                thisManager.showTranscript();
            }

            if (userInput.next().equals("quit")) {
                thisProgram.setOver();
            }
        }
    }
}
