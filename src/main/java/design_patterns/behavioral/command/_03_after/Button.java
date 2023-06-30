package main.java.design_patterns.behavioral.command._03_after;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }


    public void SetCommand(Command command) {
        this.command = command;
    }

    public void pressed() {
        this.command.execute();
    }
}
