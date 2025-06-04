package solutions.space_exploration_mission.models;

import solutions.space_exploration_mission.exceptions.InvalidAttributeException;

public class Astronaut implements Cloneable {
    private final String id;
    private final String name;
    private final int experienceYears;
    private final String specialty;

    public Astronaut(String id, String name, int experienceYears, String specialty) throws InvalidAttributeException {
        if (id == null || id.trim().isEmpty()) {
            throw new InvalidAttributeException("Astronaut ID cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidAttributeException("Astronaut name cannot be empty.");
        }
        if (experienceYears < 1 || experienceYears > 50) {
            throw new InvalidAttributeException("Experience years must be between 1 and 50.");
        }
        if (specialty == null || specialty.trim().isEmpty()) {
            throw new InvalidAttributeException("Astronaut specialty cannot be empty.");
        }
        this.id = id;
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialty = specialty;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public Astronaut clone() throws CloneNotSupportedException {
        return (Astronaut) super.clone();
    }

    @Override
    public String toString() {
        return "Astronaut [ID: " + id + ", Name: " + name + ", Exp: " + experienceYears + " years, Specialty: " + specialty + "]";
    }
}
