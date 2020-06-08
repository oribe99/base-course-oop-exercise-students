package AerialVehicles.FightetJet;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet implements AerialAttackVehicle, AerialIntelligenceVehicle {
    private String sensorType;
    private int numOfMissiles;
    private String missileType;

    public F15(String sensorType, int numOfMissiles, String missileType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.numOfMissiles = numOfMissiles;
        this.missileType = missileType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
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

    @Override
    public String collectIntelligence() {
        return this.pilotName + ": F15 Collecting Data in " + ((IntelligenceMission) mission).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String attack() {
        return this.pilotName + ": F15 Attacking " + ((AttackMission) mission).getTarget() + " with: " + this.missileType + "X" + this.numOfMissiles;
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof AttackMission || mission instanceof IntelligenceMission) {
            this.mission = mission;
        }
        else {
            throw new MissionTypeException("Mission type is not valid for vehicle!");
        }
    }
}
