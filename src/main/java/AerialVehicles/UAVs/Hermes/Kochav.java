package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.*;

public class Kochav extends Hermes implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private int numOfMissiles;
    private String missileType;
    private String cameraType;
    private String sensorType;

    public Kochav(int numOfMissiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.numOfMissiles = numOfMissiles;
        this.missileType = missileType;
        this.cameraType = cameraType;
        this.sensorType = sensorType;
    }

    public int getNumOfMissiles() {
        return numOfMissiles;
    }

    public void setNumOfMissiles(int numOfMissiles) {
        this.numOfMissiles = numOfMissiles;
    }

    public String getMissileType() {
        return missileType;
    }

    public void setMissileType(String missileType) {
        this.missileType = missileType;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof AttackMission || mission instanceof IntelligenceMission || mission instanceof BdaMission) {
            this.mission = mission;
        }
        else {
            throw new MissionTypeException("Mission type is not valid for vehicle!");
        }
    }

    @Override
    public String attack() {
        return this.pilotName + ": Kochav Attacking " + ((AttackMission) mission).getTarget() + " with: " + this.missileType + "X" + this.numOfMissiles;
    }

    @Override
    public String preformBda() {
        return this.pilotName + ": Kochav taking pictures of " + ((BdaMission) mission).getObjective() + " with: " + this.cameraType + " camera";
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName + ": Kochav Collecting Data in " + ((IntelligenceMission) mission).getRegion() + " with sensor type: " + this.sensorType;
    }
}
