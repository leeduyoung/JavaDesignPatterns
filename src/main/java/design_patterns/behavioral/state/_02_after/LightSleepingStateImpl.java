package main.java.design_patterns.behavioral.state._02_after;

public class LightSleepingStateImpl implements LightState {
    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light Change On Mode!");
        light.setLightState(new LightOnStateImpl());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setLightState(new LightOffStateImpl());
    }
}
