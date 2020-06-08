package Missions;

import Entities.Coordinates;

public class AttackMission extends Mission implements MissionService {
    private String target;

    public AttackMission(String target, Coordinates missionTargetCoordinates) {
        super(missionTargetCoordinates);
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
