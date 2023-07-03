package main.java.design_patterns.behavioral.template_method._02_after;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println(direction + " 방향으로 현대 모터 이동");
    }

}
