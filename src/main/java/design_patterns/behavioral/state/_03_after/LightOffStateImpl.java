package main.java.design_patterns.behavioral.state._03_after;

public class LightOffStateImpl implements LightState {

    private static LightOffStateImpl lightOffStateImpl = new LightOffStateImpl();

    private LightOffStateImpl() { }

    public static LightOffStateImpl getInstance() {
        return lightOffStateImpl;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light On!");
        light.setLightState(LightOnStateImpl.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("반응 없음");
    }
}
