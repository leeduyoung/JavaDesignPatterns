package main.java.design_patterns.creational.factory_method._02_after;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;

    private ResponseTimeScheduler() {}

    public static ElevatorScheduler getInstance() {
        if (scheduler == null) {
            return new ResponseTimeScheduler();
        }
        return scheduler;
    }
    @Override
    public int selectedElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 1;
    }
}
