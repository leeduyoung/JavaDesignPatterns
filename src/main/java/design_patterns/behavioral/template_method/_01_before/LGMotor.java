package main.java.design_patterns.behavioral.template_method._01_before;

import javax.naming.directory.DirContext;

public class LGMotor {

    Door door;
    MotorStatus motorStatus;

    public LGMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return this.motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    private void moveLGMotor(Direction direction) {
        System.out.println(direction + " 방향으로 LG 모터 이동");
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        if (this.door.getDoorStatus() == DoorStatus.OPENED) {
            this.door.close();
        }

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
