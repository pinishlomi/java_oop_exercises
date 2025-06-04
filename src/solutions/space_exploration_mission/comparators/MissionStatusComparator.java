package solutions.space_exploration_mission.comparators;

import solutions.space_exploration_mission.enums.MissionStatus;
import solutions.space_exploration_mission.models.SpaceMission;

import java.util.Comparator;

public class MissionStatusComparator implements Comparator<SpaceMission> {
    @Override
    public int compare(SpaceMission m1, SpaceMission m2) {
        //  ACTIVE -> PLANNED -> COMPLETED -> ABORTED
        return getStatusOrder(m1.getStatus()) - getStatusOrder(m2.getStatus());
    }

    private int getStatusOrder(MissionStatus status) {
        return switch (status) {
            case ACTIVE -> 1;
            case PLANNED -> 2;
            case COMPLETED -> 3;
            case ABORTED -> 4;
            default -> Integer.MAX_VALUE; // unknown
        };
    }
}


