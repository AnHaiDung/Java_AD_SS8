package btvn.bai1;

import java.util.Scanner;

public class AirConditioner implements Device{
    @Override
    public void turnOn() {
        System.out.println("bat dieu hoa");
    }

    @Override
    public void turnOff() {
        System.out.println("tat dieu hoa");
    }
}
