package model;

import java.util.Scanner;

public class ApplicationState {
    private Scanner input;
    private Student student;
    private Faculty science;
    private boolean isRunning;

    public ApplicationState() {
        isRunning = true;
        input = new Scanner(System.in);
        student = new Student();
        science = new Faculty("Science");
    }


    public Scanner getInput() {
        return input;
    }

    public Student getStudent() {
        return student;
    }

    public Faculty getFaculty() {
        return science;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setOver() {
        isRunning = false;
    }
}
