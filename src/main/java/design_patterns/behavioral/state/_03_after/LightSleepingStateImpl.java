package main.java.design_patterns.behavioral.state._03_after;

public class LightSleepingStateImpl implements LightState {
    private static LightSleepingStateImpl lightSleepingStateImpl = new LightSleepingStateImpl();

    private LightSleepingStateImpl() {}

    public static LightSleepingStateImpl getInstance() {
        return lightSleepingStateImpl;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light Change On Mode!");
        light.setLightState(LightOnStateImpl.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off!");
        light.setLightState(LightOffStateImpl.getInstance());
    }
}
