package Missions;


import Entities.Coordinates;

public abstract class Mission{
    private Coordinates destination;

    Mission(Coordinates destination){
        this. destination = destination;
    }

    public void begin(){
        System.out.println("Beginning Mission!");
    }

    public void cancel(){
        System.out.println("Abort Mission!");
    }

    public void finish(){
        System.out.println("Finish Mission!");
    }

    public Coordinates getDestination() {
        return destination;
    }
}
