package model;

import java.util.Scanner;

// Manages changes and information output for a given student's studies
public class StudentManager {
    private Student managee;


    public StudentManager(Student managee) {
        this.managee = managee;
    }

    public Student getManagee() {
        return managee;
    }

    public void changeSpecialization(Specialization specialization) {
        managee.setSpecialization(specialization);
    }

    public void showMainMenu() {
        System.out.println("Enter '1' to see your personal profile");
        System.out.println("Enter '2' to view your transcript");
        System.out.println("Enter '3' to edit ");
        System.out.println("Enter 'quit' to exit the application");
    }

    public void showProfileInfo() {
        System.out.println("Name: " + managee.getName());
        System.out.println("UBC ID: " + managee.getStudentID());
        System.out.println("Year level: " + managee.getYearOfStudy());
        System.out.println("Specialization: " + managee.getSpecialization().getName());
    }

    public Specialization fetchSpecialization(Scanner scanner) {
        System.out.println("Please enter your specialization as abbreviated on the SSC (eg. BIOL, CHEM, CPSC):");
        Specialization specialization = new Specialization(scanner.next());
        return specialization;
    }

    public int fetchStudyYear(Scanner scanner) {
        System.out.println("Please enter your study year:");
        return Integer.parseInt(scanner.next());
    }

    public int fetchStudentID(Scanner scanner) {
        System.out.println("Please enter your UBC student number:");
        return Integer.parseInt(scanner.next());
    }

    public String fetchName(Scanner scanner) {
        System.out.println("Welcome to the Degree Manager! Please enter your first and last name:");
        return scanner.nextLine();
    }
}
