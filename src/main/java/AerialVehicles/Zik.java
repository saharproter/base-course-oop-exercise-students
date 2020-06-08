package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Zik extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;

    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String collectIntelligence() {
        IntelligenceMission mission = (IntelligenceMission) getMission();
        return (getPilotName() + ": Zik Collecting Data in " + mission.getRegion() + " with sensor type: " + sensorType);
    }

    @Override
    public String preformBda() {
        BdaMission mission = (BdaMission) getMission();
        return (getPilotName() + ": Zik taking pictures of " + mission.getObjective() + " with: " + cameraType + " camera");
    }

    @Override
    protected int getMaxHoursAfterRepair() {
        return 100;
    }
}
