package solutions.space_exploration_mission.models;

import solutions.space_exploration_mission.enums.MissionStatus;
import solutions.space_exploration_mission.exceptions.InvalidAttributeException;
import solutions.space_exploration_mission.exceptions.MissionDebriefException;
import solutions.space_exploration_mission.exceptions.MissionLaunchException;
import solutions.space_exploration_mission.interfaces.Debriefable;
import solutions.space_exploration_mission.interfaces.Launchable;

public class SpaceMission implements Launchable, Debriefable {
    private final String missionId;
    private final CelestialBody destination;
    private final int durationDays;
    private MissionStatus status;
    private Astronaut primaryAstronaut;

    public SpaceMission(String missionId, CelestialBody destination, int durationDays, Astronaut primaryAstronaut) throws InvalidAttributeException {
        if (missionId == null || missionId.trim().isEmpty()) {
            throw new InvalidAttributeException("Mission ID cannot be empty.");
        }
        if (destination == null) {
            throw new InvalidAttributeException("Mission destination cannot be null.");
        }
        if (durationDays <= 0) {
            throw new InvalidAttributeException("Mission duration must be a positive value.");
        }
        if (primaryAstronaut == null) {
            throw new InvalidAttributeException("Primary astronaut cannot be null for a mission.");
        }
        this.missionId = missionId;
        this.destination = destination;
        this.durationDays = durationDays;
        this.primaryAstronaut = primaryAstronaut;
        this.status = MissionStatus.PLANNED;
    }

    public String getMissionId() {
        return missionId;
    }

    public CelestialBody getDestination() {
        return destination;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public MissionStatus getStatus() {
        return status;
    }

    public Astronaut getPrimaryAstronaut() {
        return primaryAstronaut;
    }

    @Override
    public void launch() throws MissionLaunchException {
        if (this.status != MissionStatus.PLANNED) {
            throw new MissionLaunchException("Cannot launch mission " + missionId + ". Current status is " + status + ", but must be PLANNED.");
        }
        this.status = MissionStatus.ACTIVE;
        System.out.println("Mission " + missionId + " launched successfully to " + destination.getName() + "!");
    }

    @Override
    public void debrief() throws MissionDebriefException {
        if (this.status != MissionStatus.COMPLETED && this.status != MissionStatus.ABORTED) {
            throw new MissionDebriefException("Cannot debrief mission " + missionId + ". Current status is " + status + ", but must be COMPLETED or ABORTED.");
        }
        System.out.println("Mission " + missionId + " debriefed. Status: " + status + ".");
    }

    public void setStatus(MissionStatus newStatus) {
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "SpaceMission [ID: " + missionId + ", Destination: " + destination.getName() + ", Duration: " + durationDays + " days, Status: " + status + ", Primary Astronaut: " + primaryAstronaut.getName() + "]";
    }
}

