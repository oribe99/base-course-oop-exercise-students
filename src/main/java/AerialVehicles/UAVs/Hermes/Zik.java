package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.*;

public class Zik extends Hermes implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
        this.sensorType = sensorType;
    }

    @Override
    public String preformBda() {
        return this.pilotName + ": Zik taking pictures of " + ((BdaMission) mission).getObjective() + " with: " + this.cameraType + " camera";
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName + ": Zik Collecting Data in " + ((IntelligenceMission) mission).getRegion() + " with sensor type: " + this.sensorType;

    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof IntelligenceMission || mission instanceof BdaMission) {
            this.mission = mission;
        }
        else {
            throw new MissionTypeException("Mission type is not valid for vehicle!");
        }
    }
}
