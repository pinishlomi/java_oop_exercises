package starters.space_exploration_mission.models;

import starters.space_exploration_mission.enums.MissionStatus;
import starters.space_exploration_mission.exceptions.InvalidAttributeException;
import starters.space_exploration_mission.exceptions.MissionDebriefException;
import starters.space_exploration_mission.exceptions.MissionLaunchException;
import starters.space_exploration_mission.interfaces.Debriefable;
import starters.space_exploration_mission.interfaces.Launchable;

public class SpaceMission {
    private String missionId;
    private CelestialBody destination;
    private int durationDays;
    private MissionStatus status;
    private Astronaut primaryAstronaut;

    @Override
    public String toString() {
        return "SpaceMission [ID: " + missionId ;// + ", Destination: " + destination.getName() + ", Duration: " + durationDays + " days, Status: " + status + ", Primary Astronaut: " + primaryAstronaut.getName() + "]";
    }
}

