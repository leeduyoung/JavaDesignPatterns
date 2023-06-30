package main.java.design_patterns.behavioral.strategy._02_after;

public class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        this.name = name;
        this.movingStrategy = movingStrategy;
        this.attackStrategy = attackStrategy;
    }

    public String getName() {
        return name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void move() {
        this.movingStrategy.move();
    }

    public void attack() {
        this.attackStrategy.attack();
    }
}

