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

    public int getArtsCredits() {
        return 12;
    }

    public int getScienceCredits() {
        return 72;
    }

    public int getUpperLevelTotalCredits() {
        return 48;
    }

    public int getUpperLevelScienceCredits() {
        return 30;
    }
}
