package main.java.design_patterns.structural.composite._01_before;

public class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer(Body body, Keyboard keyboard, Monitor monitor) {
        this.body = body;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public int getPrice() {
        return this.body.getPrice() +
                this.keyboard.getPrice() +
                this.monitor.getPrice();
    }

    public int getPower() {
        return this.body.getPower() +
                this.keyboard.getPower() +
                this.monitor.getPower();
    }
}
