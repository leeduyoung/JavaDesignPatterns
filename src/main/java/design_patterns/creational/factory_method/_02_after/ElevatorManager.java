package main.java.design_patterns.creational.factory_method._02_after;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID schedulingStrategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID schedulingStrategyID) {
        this.controllers = new ArrayList(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController elevatorController = new ElevatorController(i);
            controllers.add(elevatorController);
        }
        this.schedulingStrategyID = schedulingStrategyID;
    }

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = ScheduleFactory.getScheduler(this.schedulingStrategyID);

        int selectedElevator = scheduler.selectedElevator(this, destination, direction);
        this.controllers.get(selectedElevator).gotoFloor(destination);
    }
}
