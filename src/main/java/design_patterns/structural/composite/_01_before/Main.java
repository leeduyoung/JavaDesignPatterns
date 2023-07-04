package main.java.design_patterns.structural.composite._01_before;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new Body(500, 1000000),
                new Keyboard(10, 120000),
                new Monitor(300, 340000)
        );

        int price = computer.getPrice();
        int power = computer.getPower();

        System.out.println("total price: " + price);
        System.out.println("total power: " +  power);
    }
}
