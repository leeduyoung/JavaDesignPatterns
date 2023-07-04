package main.java.design_patterns.structural.composite._02_after;

public class Monitor implements ComputerDevice {
    private int price;
    private int power;

    public Monitor(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getPower() {
        return this.power;
    }
}