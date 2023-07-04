package main.java.design_patterns.creational.factory_method._02_after;

import java.util.Calendar;

public class ScheduleFactory {
    private ElevatorScheduler elevatorScheduler;

    public static ElevatorScheduler getScheduler(SchedulingStrategyID schedulingStrategyID) {
        ElevatorScheduler ret = null;

        switch (schedulingStrategyID) {
            case RESPONSE_TIME:
                ret = ResponseTimeScheduler.getInstance();
                break;
            case THROUGHPUT:
                ret = ThroughputScheduler.getInstance();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    ret = ResponseTimeScheduler.getInstance();
                } else {
                    ret = ThroughputScheduler.getInstance();
                }
        }

        return ret;
    }
}
