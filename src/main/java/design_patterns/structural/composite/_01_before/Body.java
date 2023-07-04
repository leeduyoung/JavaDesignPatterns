package main.java.design_patterns.structural.composite._01_before;

public class Body {
    private int power;
    private int price;

    public Body(int power, int price) {
        this.power = power;
        this.price = price;
    }

    public int getPower() {
        return this.power;
    }

    public int getPrice() {
        return this.price;
    }
}
