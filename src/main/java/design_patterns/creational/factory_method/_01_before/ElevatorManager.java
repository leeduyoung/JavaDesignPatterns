package main.java.design_patterns.creational.factory_method._01_before;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        this.controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController elevatorController = new ElevatorController(i);
            controllers.add(elevatorController);
        }
    }

    public void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12) {
            scheduler = new ResponseTimeScheduler();
        } else {
            scheduler = new ThroughputScheduler();
        }

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        this.controllers.get(selectedElevator).gotoFloor(destination);
    }
}
