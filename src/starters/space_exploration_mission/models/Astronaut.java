package starters.space_exploration_mission.models;

public class Astronaut implements Cloneable {
    private String id;
    private String name;
    private int experienceYears;
    private String specialty;

    @Override
    public String toString() {
        return "Astronaut [ID: " + id + ", Name: " + name + ", Exp: " + experienceYears + " years, Specialty: " + specialty + "]";
    }
}
