package main.java.design_patterns.behavioral.state._03_after;

public class Light {
    private LightState lightState;

    public Light() {
        this.lightState = LightOffStateImpl.getInstance();
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void onButtonPushed() {
        lightState.onButtonPushed(this);
    }

    public void offButtonPushed() {
        lightState.offButtonPushed(this);
    }
}
