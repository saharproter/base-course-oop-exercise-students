package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {
    private String objective;

    public BdaMission(String objective, Coordinates destination){
        super(destination);
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }
}
