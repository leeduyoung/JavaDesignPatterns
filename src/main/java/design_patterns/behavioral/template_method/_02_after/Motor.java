package main.java.design_patterns.behavioral.template_method._02_after;

public abstract class Motor {

    Door door;
    MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return this.motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        if (this.door.getDoorStatus() == DoorStatus.OPENED) {
            this.door.close();
        }

        this.moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
