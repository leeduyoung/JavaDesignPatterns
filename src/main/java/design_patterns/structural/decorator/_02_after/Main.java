package main.java.design_patterns.structural.decorator._02_after;

public class Main {

    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        System.out.println("============");

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        System.out.println("============");

        Display roadWithLaneWithTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneWithTraffic.draw();
    }

}
