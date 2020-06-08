package AerialVehicles.FightetJet;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialAttackVehicle, AerialBdaVehicle {
    private String cameraType;
    private int numOfMissiles;
    private String missileType;

    public F16(String cameraType, int numOfMissiles, String missileType, String pilotName, Mission mission, int hoursSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
        this.numOfMissiles = numOfMissiles;
        this.missileType = missileType;
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
    public String attack() {
        return this.pilotName + ": F16 Attacking " + ((AttackMission) mission).getTarget() + " with: " + this.missileType + "X" + this.numOfMissiles;
    }

    @Override
    public String preformBda() {
        return this.pilotName + ": F16 taking pictures of " + ((BdaMission) mission).getObjective() + " with: " + this.cameraType + " camera";
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof AttackMission || mission instanceof BdaMission) {
            this.mission = mission;
        } else {
            throw new MissionTypeException("Mission type is not valid for vehicle!");
        }
    }
}
