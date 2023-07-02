package main.java.design_patterns.structural.decorator._01_before;

/**
 * 기능의 조합별로 하위 클래스를 구현해야하는 문제가 있다.
 * 조합수가 늘어나는 문제를 해결할 수 있는 설계를 하려면 각 추가 기능별로
 * 개별적인 클래스를 설계하고 기능을 조합할 때  각 클래스의 객체 조합을 이용하면 된다.
 */

public class Main {
    public static void main(String[] args) {
        RoadDisplay road = new RoadDisplay();
        road.draw(); // 기본 도로 표시

        System.out.println("============");

        RoadDisplay roadWithLane = new RoadDisplayWithLane();
        roadWithLane.draw(); // 기본 도로 + 차선 표시

        System.out.println("============");

        RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
        roadWithTraffic.draw();

        System.out.println("============");

        RoadDisplay roadWithLaneWithTraffic = new RoadDisplayWithLaneWithTraffic();
        roadWithLaneWithTraffic.draw();
    }
}
