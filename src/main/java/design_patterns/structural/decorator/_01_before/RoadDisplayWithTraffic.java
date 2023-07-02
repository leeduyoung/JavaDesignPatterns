package main.java.design_patterns.structural.decorator._01_before;

public class RoadDisplayWithTraffic extends RoadDisplay {

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("교토량 표시");
    }
}
