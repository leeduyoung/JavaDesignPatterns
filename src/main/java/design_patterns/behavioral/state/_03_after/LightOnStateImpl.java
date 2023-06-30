package main.java.design_patterns.behavioral.state._03_after;

public class LightOnStateImpl implements LightState {

    private static LightOnStateImpl lightOnStateImpl = new LightOnStateImpl();

    private LightOnStateImpl() { }

    public static LightOnStateImpl getInstance() {
        return lightOnStateImpl;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light Change Sleeping Mode!");
        light.setLightState(LightSleepingStateImpl.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setLightState(LightOffStateImpl.getInstance());
    }
}
