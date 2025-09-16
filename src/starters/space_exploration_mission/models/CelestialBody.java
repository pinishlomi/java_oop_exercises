package starters.space_exploration_mission.models;

import starters.space_exploration_mission.exceptions.InvalidAttributeException;

public class CelestialBody  {
    protected String name;
    protected double mass;
    protected double distanceFromEarth;


    @Override
    public String toString() {
        return "CelestialBody [Name: " + name + ", Mass: " + mass + " kg, Distance: " + distanceFromEarth + " km]";
    }
}

