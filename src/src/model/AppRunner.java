package model;

// Determines if application will run
public class AppRunner {
    private boolean isRunning;

    public AppRunner() {
        isRunning = true;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setOver() {
        System.out.println("Goodbye!");
        isRunning = false;
    }
}

