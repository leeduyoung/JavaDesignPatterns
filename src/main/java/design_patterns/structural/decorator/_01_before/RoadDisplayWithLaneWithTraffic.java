package main.java.design_patterns.structural.decorator._01_before;

public class RoadDisplayWithLaneWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();
        drawLaneWithTraffic();
    }

    private void drawLaneWithTraffic() {
        drawLane();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("교통량 표시");
    }

    private void drawLane() {
        System.out.println("차선 표시");
    }


}
