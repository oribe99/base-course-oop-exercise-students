package AerialVehicles.UAVs.Haron;

import AerialVehicles.UAVs.UAV;
import Missions.Mission;

public abstract class Haron extends UAV {

    protected final int HARON_MAX_HOURS_SINCE_LAST_REPAIR = 150;

    public Haron(String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
    }

    @Override
    public void check() {
        if(this.hoursOfFlightSinceLastRepair > HARON_MAX_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }

}
