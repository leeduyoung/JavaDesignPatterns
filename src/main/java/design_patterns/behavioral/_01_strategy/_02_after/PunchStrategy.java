package main.java.design_patterns.behavioral._01_strategy._02_after;

public class PunchStrategy implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Punch Attack!");
    }
}
