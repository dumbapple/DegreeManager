package model;

import java.util.ArrayList;
import java.util.List;

// Represents a faculty that determines a student's degree requirements
public class Faculty {
    private String name;
    private List<Specialization> specializations;

    public Faculty(String name) {
        this.name = name;
        specializations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public int getMaxCreditsAllowed() {
        return 180;
    }

    public int getScienceCredits() {
        return 72;
    }

    public int getArtsCredits() {
        return 12;
    }

    public int getThirdYearPlusTotalCredits() {
        return 48;
    }

    public int getThirdYearPlusScienceCredits() {
        return 30;
    }
}
