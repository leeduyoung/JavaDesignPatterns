package main.java.design_patterns.structural.composite._01_before;

public class Keyboard {
    private int price;
    private int power;

    public Keyboard(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getPower() {
        return this.power;
    }
}
