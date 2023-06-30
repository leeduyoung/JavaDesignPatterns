package main.java.design_patterns.behavioral.strategy._02_after;

public class Main {

    public static void main(String[] args) {

        Robot taekwonV = new Robot("mango", new FlyingStrategy(),new PunchStrategy());
        Robot atom = new Robot("kaye", new WalkingStrategy(), new MissileStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

