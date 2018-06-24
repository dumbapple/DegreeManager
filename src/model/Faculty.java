package model;

// Represents a faculty that determines a student's degree requirements
public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxCreditsAllowed() {
        return 180;
    }

    public int getArtsCred() {
        return 12;
    }

    public int getScienceCred() {
        return 72;
    }

    public int getUpYrCred() {
        return 48;
    }

    public int getUpYrScienceCred() {
        return 30;
    }
}
