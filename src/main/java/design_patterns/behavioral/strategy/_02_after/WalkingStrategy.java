package main.java.design_patterns.behavioral.strategy._02_after;

public class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("walking...");
    }
}
