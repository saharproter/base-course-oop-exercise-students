package AerialVehicles;

import Missions.*;

public class Kochav extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private int rocketsNum;
    private String rocketType;

    private String sensorType;

    private String cameraType;

    public Kochav(int rocketsNum, String rocketType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.rocketsNum = rocketsNum;
        this.rocketType = rocketType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        AttackMission mission = (AttackMission) getMission();
        return (getPilotName() + ": Kochav Attacking " + mission.getTarget() + " with: " + rocketType + "X" + rocketsNum);
    }

    @Override
    public String collectIntelligence() {
        IntelligenceMission mission = (IntelligenceMission) getMission();
        return (getPilotName() + ": Kochav Collecting Data in " + mission.getRegion() + " with sensor type: " + sensorType);
    }

    @Override
    public String preformBda() {
        BdaMission mission = (BdaMission) getMission();
        return (getPilotName() + ": Kochav taking pictures of " + mission.getObjective() + " with: " + cameraType + " camera");
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 100;
    }
}
