package btvn.bai3;

import btvn.bai1.Device;

import java.util.Scanner;

public class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("bat quat");
    }

    @Override
    public void turnOff() {
        System.out.println("tat quat");
    }
}
