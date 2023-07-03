package main.java.design_patterns.behavioral.template_method._02_after;


public class Door {

    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return this.doorStatus;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void open() {
        doorStatus = DoorStatus.OPENED;
    }
}
