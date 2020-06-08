package Missions;

import Entities.Coordinates;

public abstract class Mission implements MissionService {
    protected Coordinates missionTargetCoordinates;

    public Mission(Coordinates missionTargetCoordinates) {
        this.missionTargetCoordinates = missionTargetCoordinates;
    }

    public void begin() {
        System.out.println("Beginning Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }

}
