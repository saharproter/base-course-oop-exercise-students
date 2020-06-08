package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle{
    private int rocketsNum;
    private String rocketType;

    private String sensorType;

    public Eitan(int rocketsNum, String rocketType, String sensorType,  String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.rocketsNum = rocketsNum;
        this.rocketType = rocketType;
    }

    @Override
    public String attack() {
        AttackMission mission = (AttackMission) getMission();
        return (getPilotName() + ": Eitan Attacking " + mission.getTarget() + " with: " + rocketType + "X" + rocketsNum);
    }

    @Override
    public String collectIntelligence() {
        IntelligenceMission mission = (IntelligenceMission) getMission();
        return (getPilotName() + ": Eitan Collecting Data in " + mission.getRegion() + " with sensor type: " + sensorType);
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 150;
    }
}
