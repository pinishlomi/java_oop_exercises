package starters.space_exploration_mission.models;

import starters.space_exploration_mission.exceptions.InvalidAttributeException;

public class Planet  {
    private boolean hasAtmosphere;


    @Override
    public String toString() {
        return "Planet [Name: ";/* + name + ", Mass: " + mass + " kg, Distance: " + distanceFromEarth + " km, Atmosphere: " + hasAtmosphere + "]";*/
    }
}
