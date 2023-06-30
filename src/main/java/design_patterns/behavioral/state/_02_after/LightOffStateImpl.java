package main.java.design_patterns.behavioral.state._02_after;

public class LightOffStateImpl implements LightState {
    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light On!");
        light.setLightState(new LightOnStateImpl());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("반응 없음");
    }
}
