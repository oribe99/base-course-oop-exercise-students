package Missions;

import Entities.Coordinates;

public class BdaMission extends Mission implements MissionService {
    private String objective;

    public BdaMission(String objective, Coordinates missionTargetCoordinates) {
        super(missionTargetCoordinates);
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
