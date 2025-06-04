package solutions.space_exploration_mission.models;

import solutions.space_exploration_mission.exceptions.InvalidAttributeException;

public abstract class CelestialBody implements Comparable<CelestialBody> {
    protected final String name;
    protected final double mass;
    protected final double distanceFromEarth;

    public CelestialBody(String name, double mass, double distanceFromEarth) throws InvalidAttributeException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidAttributeException("Celestial body name cannot be empty.");
        }
        if (mass <= 0) {
            throw new InvalidAttributeException("Mass must be a positive value.");
        }
        this.name = name;
        if (!this.getName().equals("Earth") &&  distanceFromEarth <= 0) {
            throw new InvalidAttributeException("Distance from Earth must be a positive value.");
        }
        this.mass = mass;
        this.distanceFromEarth = distanceFromEarth;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public abstract void describe();

    @Override
    public int compareTo(CelestialBody other) {
        int distanceComparison = Double.compare(this.distanceFromEarth, other.distanceFromEarth);
        if (distanceComparison != 0) {
            return distanceComparison;
        }
        return Double.compare(this.mass, other.mass);
    }

    @Override
    public String toString() {
        return "CelestialBody [Name: " + name + ", Mass: " + mass + " kg, Distance: " + distanceFromEarth + " km]";
    }
}

