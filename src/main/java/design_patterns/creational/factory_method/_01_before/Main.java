package main.java.design_patterns.creational.factory_method._01_before;

public class Main {

    public static void main(String[] args) {
        ElevatorManager elevatorManager = new ElevatorManager(6);
        elevatorManager.requestElevator(11, Direction.UP);
    }
}

