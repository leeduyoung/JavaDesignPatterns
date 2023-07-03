package main.java.design_patterns.creational.factory_method._01_before;

public class ResponseTimeScheduler implements ElevatorScheduler {
    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 1;
    }
}
