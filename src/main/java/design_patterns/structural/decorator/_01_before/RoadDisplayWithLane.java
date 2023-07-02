package main.java.design_patterns.structural.decorator._01_before;

public class RoadDisplayWithLane extends RoadDisplay {

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("차선 표기");
    }
}
