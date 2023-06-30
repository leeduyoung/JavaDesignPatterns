package main.java.design_patterns.behavioral.state._02_after;

public interface LightState {
    void onButtonPushed(Light light);
    void offButtonPushed(Light light);
}
