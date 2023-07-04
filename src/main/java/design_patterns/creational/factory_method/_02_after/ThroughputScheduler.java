package main.java.design_patterns.creational.factory_method._02_after;

public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;

    private ThroughputScheduler() {}


    public static ElevatorScheduler getInstance() {
        if (scheduler == null) {
            return new ThroughputScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectedElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
