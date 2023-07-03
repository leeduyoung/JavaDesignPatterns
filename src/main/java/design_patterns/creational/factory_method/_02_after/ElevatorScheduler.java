package main.java.design_patterns.creational.factory_method._02_after;

public interface ElevatorScheduler {
    int selectedElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
