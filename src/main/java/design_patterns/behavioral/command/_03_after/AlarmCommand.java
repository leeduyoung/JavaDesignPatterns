package main.java.design_patterns.behavioral.command._03_after;

public class AlarmCommand implements Command{

    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        this.alarm.start();
    }
}
