package main.java.design_patterns.behavioral.state._02_after;

public class LightOnStateImpl implements LightState {

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light Change Sleeping Mode!");
        light.setLightState(new LightSleepingStateImpl());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setLightState(new LightOffStateImpl());
    }
}
