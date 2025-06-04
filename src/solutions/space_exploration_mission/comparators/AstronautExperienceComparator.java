package solutions.space_exploration_mission.comparators;

import solutions.space_exploration_mission.models.Astronaut;

import java.util.Comparator;

public class AstronautExperienceComparator implements Comparator<Astronaut> {
    @Override
    public int compare(Astronaut a1, Astronaut a2) {
        // first compare by experience
        int experienceComparison = Integer.compare(a2.getExperienceYears(), a1.getExperienceYears());
        if (experienceComparison != 0) {
            return experienceComparison;
        }
        // second (if needed) compare by name
        return a1.getName().compareTo(a2.getName());
    }
}

