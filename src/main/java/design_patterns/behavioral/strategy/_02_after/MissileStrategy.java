package main.java.design_patterns.behavioral.strategy._02_after;

public class MissileStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Missile Attack!");
    }
}
