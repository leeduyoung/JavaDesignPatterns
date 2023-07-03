package main.java.design_patterns.creational.factory_method._02_after;

public class ResponseTimeScheduler implements ElevatorScheduler {
    @Override
    public int selectedElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 1;
    }
}
