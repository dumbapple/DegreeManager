package model;

public class ApplicationState {
    private boolean isRunning;
    private StudentManager studentManager;


    public ApplicationState(StudentManager studentManager) {
        isRunning = true;
        this.studentManager = studentManager;

    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setOver() {
        isRunning = false;
    }


}

