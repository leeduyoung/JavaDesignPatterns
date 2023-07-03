package main.java.design_patterns.creational.factory_method._02_after;

public class ScheduleFactory {
    private ElevatorScheduler elevatorScheduler;

    public static ElevatorScheduler getScheduler(SchedulingStrategyID schedulingStrategyID) {
        ElevatorScheduler ret = null;

        switch (schedulingStrategyID) {
            case RESPONSE_TIME:
                ret = new ResponseTimeScheduler();
                break;
            case THROUGHPUT:
                ret = new ThroughputScheduler();
                break;
        }

        return ret;
    }
}
