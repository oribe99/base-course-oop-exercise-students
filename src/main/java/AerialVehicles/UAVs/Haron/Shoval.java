package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.*;

public class Shoval extends Haron implements AerialIntelligenceVehicle, AerialBdaVehicle, AerialAttackVehicle {
    private String sensorType;
    private String cameraType;
    private int numOfMissiles;
    private String missileType;

    public Shoval(String cameraType, int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
        this.numOfMissiles = numOfMissiles;
        this.missileType = missileType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
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

    @Override
    public String preformBda() {
        return this.pilotName + ": Shoval taking pictures of " + ((BdaMission) mission).getObjective() + " with: " + this.cameraType + " camera";
    }

    @Override
    public String collectIntelligence() {
        return this.pilotName + ": Shoval Collecting Data in " + ((IntelligenceMission) mission).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String attack()  {
        return this.pilotName + ": Shoval Attacking " + ((AttackMission) mission).getTarget() + " with: " + this.missileType + "X" + this.numOfMissiles;
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
}

