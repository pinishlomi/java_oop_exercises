package solutions.space_exploration_mission.interfaces;

import solutions.space_exploration_mission.exceptions.MissionLaunchException;

public interface Launchable {
    void launch() throws MissionLaunchException;
}
