package AerialVehicles.UAVs.Hermes;

import AerialVehicles.UAVs.UAV;
import Missions.Mission;

public abstract class Hermes extends UAV {
    protected final int HERMES_MAX_HOURS_SINCE_LAST_REPAIR = 100;

    public Hermes(String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
    }

    @Override
    public void check() {
        if(this.hoursOfFlightSinceLastRepair > HERMES_MAX_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
