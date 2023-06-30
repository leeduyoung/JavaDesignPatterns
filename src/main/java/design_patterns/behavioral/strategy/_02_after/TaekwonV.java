package main.java.design_patterns.behavioral.strategy._02_after;

public class TaekwonV extends Robot {

    public TaekwonV(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        super(name, movingStrategy, attackStrategy);
    }
}
