package main.java.design_patterns.structural.decorator._02_after;

public class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }
    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}


