package main.java.design_patterns.structural.composite._02_after;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.addDevice(new Body(1000000, 500));
        computer.addDevice(new Monitor(340000, 300));
        computer.addDevice(new Keyboard(120000, 10));

        int price = computer.getPrice();
        int power = computer.getPower();
        System.out.println("total price: " + price);
        System.out.println("total power: " + power);
    }
}
