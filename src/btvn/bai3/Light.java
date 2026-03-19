package btvn.bai3;

import btvn.bai1.Device;

import java.util.Scanner;

public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("bat den");
    }

    @Override
    public void turnOff() {
        System.out.println("tat den");
    }
}
