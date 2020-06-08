package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    private String pilotName;
    private Mission mission;
    private int hoursOfFlightSinceLastRepair;
    private boolean isReadyToFly;

    protected AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.isReadyToFly = isReadyToFly;
    }

    protected abstract int getMaxHoursAfterRepair();

    public void flyTo() {
        System.out.println("Flying to: " + mission.getDestination().getLatitude() + ", " + mission.getDestination().getLongitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public void repair() {
        isReadyToFly = true;
        hoursOfFlightSinceLastRepair = 0;
    }

    public void check(){
        if(getMaxHoursAfterRepair() < hoursOfFlightSinceLastRepair)
            repair();
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Mission getMission() {
        return mission;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public String getPilotName() {
        return pilotName;
    }
}
