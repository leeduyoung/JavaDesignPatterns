package main.java.design_patterns.structural.composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<ComputerDevice> deviceList = new ArrayList<>();

    public Computer() {

    }
    public Computer(List<ComputerDevice> deviceList) {
        this.deviceList = deviceList;
    }


    public void addDevice(ComputerDevice device) {
        this.deviceList.add(device);
    }


    public int getPrice() {
        int totalPrice = 0;
        for (ComputerDevice computerDevice: this.deviceList) {
            totalPrice += computerDevice.getPrice();
        }
        return totalPrice;
    }

    public int getPower() {
        int totalPower = 0;
        for (ComputerDevice computerDevice: this.deviceList) {
            totalPower += computerDevice.getPower();
        }
        return totalPower;
    }
}
