package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private int minCreditsForGraduation;
    private int maxCreditsForGraduation;
    private List<Specialization> specializations;

    public Faculty(String name, int maxCreditsForGraduation) {
        this.name = name;
        this.maxCreditsForGraduation = maxCreditsForGraduation;
        specializations = new ArrayList<>();
    }

    public int getMinCreditsForGraduation() {
        return minCreditsForGraduation;
    }

    public int getMaxCreditsForGraduation() {
        return maxCreditsForGraduation;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }
}
