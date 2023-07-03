package main.java.design_patterns.behavioral.template_method._01_before;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);

        LGMotor lgMotor = new LGMotor(door);
        lgMotor.move(Direction.DOWN);
    }
}

