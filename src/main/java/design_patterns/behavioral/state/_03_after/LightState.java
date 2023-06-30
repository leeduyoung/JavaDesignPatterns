package main.java.design_patterns.behavioral.state._03_after;

public interface LightState {
    void onButtonPushed(Light light);
    void offButtonPushed(Light light);
}
