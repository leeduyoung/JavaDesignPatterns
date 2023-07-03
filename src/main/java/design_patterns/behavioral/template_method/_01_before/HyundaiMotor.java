package main.java.design_patterns.behavioral.template_method._01_before;

public class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return this.motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    private void moveHyundaiMotor(Direction direction) {
        System.out.println(direction + " 방향으로 현대 모터 이동");
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            this.door.close();
        }

        moveHyundaiMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
