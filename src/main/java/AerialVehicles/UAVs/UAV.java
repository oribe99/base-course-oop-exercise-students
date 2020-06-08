package AerialVehicles.UAVs;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class UAV extends AerialVehicle {

    public UAV(String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
    }

}
