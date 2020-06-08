package AerialVehicles.FightetJet;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class FighterJet extends AerialVehicle {

    protected final int FIGHTER_MAX_HOURS_SINCE_LAST_REPAIR = 250;

    public FighterJet(String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
    }

    @Override
    public void check() {
        if(this.hoursOfFlightSinceLastRepair > FIGHTER_MAX_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
