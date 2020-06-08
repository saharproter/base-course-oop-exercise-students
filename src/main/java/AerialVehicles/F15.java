package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {
    private int rocketsNum;
    private String rocketType;

    private String sensorType;

    public F15(String sensorType, int rocketsNum, String rocketType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.rocketsNum = rocketsNum;
        this.rocketType = rocketType;
    }

    @Override
    public String attack() {
        AttackMission mission = (AttackMission) getMission();
        return (getPilotName() + ": F15 Attacking " + mission.getTarget() + " with: " + rocketType + "X" + rocketsNum);
    }

    @Override
    public String collectIntelligence() {
        IntelligenceMission mission = (IntelligenceMission) getMission();
        return (getPilotName() + ": F15 Collecting Data in " + mission.getRegion() + " with sensor type: " + sensorType);
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 250;
    }
}
