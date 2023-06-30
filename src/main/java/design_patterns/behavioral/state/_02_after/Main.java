package main.java.design_patterns.behavioral.state._02_after;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        light.offButtonPushed();
        light.onButtonPushed();
        light.onButtonPushed();
        light.onButtonPushed();
        light.offButtonPushed();
    }
}
