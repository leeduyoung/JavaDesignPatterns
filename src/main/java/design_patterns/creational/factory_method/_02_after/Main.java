package main.java.design_patterns.creational.factory_method._02_after;

public class Main {
    public static void main(String[] args) {
        ElevatorManager elevatorManager = new ElevatorManager(6, SchedulingStrategyID.DYNAMIC);
        elevatorManager.requestElevator(11, Direction.UP);
    }
}
