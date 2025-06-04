package solutions.space_exploration_mission.models;

import solutions.space_exploration_mission.exceptions.InvalidAttributeException;

public class Planet extends CelestialBody {
    private final boolean hasAtmosphere;

    public Planet(String name, double mass, double distanceFromEarth, boolean hasAtmosphere) throws InvalidAttributeException {
        super(name, mass, distanceFromEarth);
        this.hasAtmosphere = hasAtmosphere;
    }

    public boolean hasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public void describe() {
        System.out.println("This is a Planet named " + name + ". It " + (hasAtmosphere ? "has" : "does not have") + " an atmosphere.");
    }

    @Override
    public String toString() {
        return "Planet [Name: " + name + ", Mass: " + mass + " kg, Distance: " + distanceFromEarth + " km, Atmosphere: " + hasAtmosphere + "]";
    }
}
