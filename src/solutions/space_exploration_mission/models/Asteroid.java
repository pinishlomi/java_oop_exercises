package solutions.space_exploration_mission.models;

import solutions.space_exploration_mission.exceptions.InvalidAttributeException;

public class Asteroid extends CelestialBody {
    private final double rotationPeriodHours;

    public Asteroid(String name, double mass, double distanceFromEarth, double rotationPeriodHours) throws InvalidAttributeException {
        super(name, mass, distanceFromEarth);
        if (rotationPeriodHours <= 0) {
            throw new InvalidAttributeException("Rotation period must be a positive value.");
        }
        this.rotationPeriodHours = rotationPeriodHours;
    }

    public double getRotationPeriodHours() {
        return rotationPeriodHours;
    }

    @Override
    public void describe() {
        System.out.println("This is an Asteroid named " + name + ". It rotates every " + rotationPeriodHours + " hours.");
    }

    @Override
    public String toString() {
        return "Asteroid [Name: " + name + ", Mass: " + mass + " kg, Distance: " + distanceFromEarth + " km, Rotation: " + rotationPeriodHours + " hours]";
    }
}

