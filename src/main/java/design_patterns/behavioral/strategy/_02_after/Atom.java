package main.java.design_patterns.behavioral.strategy._02_after;

public class Atom extends Robot {

    public Atom(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        super(name, movingStrategy, attackStrategy);
    }
}
