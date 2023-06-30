package main.java.design_patterns.behavioral.command._02_before;

public class Button {
    private Alarm alarm;

    public Button(Alarm alarm) {
        this.alarm = alarm;
    }

    public void pressed() {
        alarm.start();
    }
}
