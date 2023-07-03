package main.java.design_patterns.creational.factory_method._01_before;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
