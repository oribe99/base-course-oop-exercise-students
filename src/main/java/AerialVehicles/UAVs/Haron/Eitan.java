package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends Haron implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private int numOfMissiles;
    private String missileType;
    private String sensorType;

    public Eitan(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.numOfMissiles = numOfMissiles;
        this.missileType = missileType;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {
        return this.pilotName + ": Eitan Attacking " + ((AttackMission) mission).getTarget() + " with: " + this.missileType + "X" + this.numOfMissiles;
    }

    @Override
    public String collectIntelligence()  {
        return this.pilotName + ": Eitan Collecting Data in " + ((IntelligenceMission) mission).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof IntelligenceMission || mission instanceof AerialAttackVehicle) {
            this.mission = mission;
        }
        else {
            throw new MissionTypeException("Mission type is not valid for vehicle!");
        }
    }
}
