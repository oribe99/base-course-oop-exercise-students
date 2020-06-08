package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    protected String pilotName;
    protected Mission mission;
    protected int hoursOfFlightSinceLastRepair;
    protected boolean isReadyToFly;

    public AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.isReadyToFly = isReadyToFly;
    }

    public String getPilotName() {
        return this.pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return this.mission;
    }

    public abstract void setMission(Mission mission) throws MissionTypeException;

    public int getHoursOfFlightSinceLastRepair() {
        return this.hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public boolean isReadyToFly() {
        return isReadyToFly;
    }

    public void setReadyToFly(boolean readyToFly) {
        this.isReadyToFly = readyToFly;
    }

    public void flyTO(Coordinates flyToCoordinates) {
        System.out.println("Flying to: " + flyToCoordinates.getLongitude() + ", " + flyToCoordinates.getLatitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public abstract void check();

    public void repair() {
        this.isReadyToFly = true;
        this.hoursOfFlightSinceLastRepair = 0;
    }
}
