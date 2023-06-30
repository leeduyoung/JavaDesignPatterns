package main.java.design_patterns.behavioral.command._03_after;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        Button button = new Button(lampOnCommand);
        button.pressed();

        button.SetCommand(new LampOffCommand(lamp));
        button.pressed();

        Alarm alarm = new Alarm();
        button.SetCommand(new AlarmCommand(alarm));
        button.pressed();
    }
}
