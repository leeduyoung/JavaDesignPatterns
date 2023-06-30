package main.java.design_patterns.behavioral._01_strategy._01_before;

public class TaekwonV extends Robot {

    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have missile and can attack with it");
    }

    @Override
    public void move() {
        System.out.println("I can only walk");
    }
}

