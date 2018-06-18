package model;

// Keeps track of conditions under which main application may run
public class ApplicationOverseer {
    private boolean isRunning;
    private StudentManager studentManager;

    public ApplicationOverseer(StudentManager studentManager) {
        isRunning = true;
        this.studentManager = studentManager;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setOver() {
        System.out.println("Goodbye!");
        isRunning = false;
    }


    public StudentManager getStudentManager() {
        return studentManager;
    }
}

