package main.java.design_patterns.behavioral._01_strategy._02_after;

public class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("walking...");
    }
}
