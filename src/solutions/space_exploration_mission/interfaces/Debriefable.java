package solutions.space_exploration_mission.interfaces;

import solutions.space_exploration_mission.exceptions.MissionDebriefException;

public interface Debriefable {
    void debrief() throws MissionDebriefException;
}
