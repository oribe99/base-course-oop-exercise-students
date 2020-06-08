package Missions;

import Entities.Coordinates;

public class IntelligenceMission extends Mission implements MissionService {
    private String region;

    public IntelligenceMission(String region, Coordinates missionTargetCoordinates) {
        super(missionTargetCoordinates);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}
