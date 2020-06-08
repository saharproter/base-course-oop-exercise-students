package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;

public class F16 extends AerialVehicle implements AerialAttackVehicle, AerialBdaVehicle {
    private String cameraType;

    private int rocketsNum;
    private String rocketType;

    public F16(String cameraType, int rocketsNum, String rocketType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
        this.rocketsNum = rocketsNum;
        this.rocketType = rocketType;
    }

    @Override
    public String attack() {
        AttackMission mission = (AttackMission) getMission();
        return (getPilotName() + ": F16 Attacking " + mission.getTarget() + " with: " + rocketType + "X" + rocketsNum);
    }

    @Override
    public String preformBda() {
        BdaMission mission = (BdaMission) getMission();
        return (getPilotName() + ": F16 taking pictures of " + mission.getObjective() + " with: " + cameraType+" camera");
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 250;
    }
}
