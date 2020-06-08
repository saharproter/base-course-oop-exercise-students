package AerialVehicles;

import Missions.*;

public class Shoval extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {
    private int rocketsNum;
    private String rocketType;

    private String sensorType;

    private String cameraType;

    public Shoval(String cameraType, int rocketsNum, String rocketType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.rocketsNum = rocketsNum;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        AttackMission mission = (AttackMission) getMission();
        return (getPilotName() + ": Shoval Attacking " + mission.getTarget() + " with: " + rocketType + "X" + rocketsNum);
    }

    @Override
    public String collectIntelligence() {
        IntelligenceMission mission = (IntelligenceMission) getMission();
        return (getPilotName() + ": Shoval Collecting Data in " + mission.getRegion() + " with sensor type: " + sensorType);
    }

    @Override
    public String preformBda() {
        BdaMission mission = (BdaMission) getMission();
        return (getPilotName() + ": Shoval taking pictures of " + mission.getObjective() + " with: " + cameraType + " camera");
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 150;
    }
}

