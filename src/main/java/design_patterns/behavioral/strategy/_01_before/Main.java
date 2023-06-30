package main.java.design_patterns.behavioral.strategy._01_before;

public class Main {
    public static void main(String[] args) {

        Robot taekwonV = new TaekwonV("mango");
        Robot atom = new Atom("kaye");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

