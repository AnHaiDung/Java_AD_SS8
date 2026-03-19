package btvn.bai3;

import btvn.btth.factory.Device;

import java.util.Scanner;

public class AirConditioner implements Device {
    private int temp =26;
    public void setTemp(int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public void turnOn() {
        System.out.println("da bat dieu hoa"+temp);
    }

    @Override
    public void turnOff() {
        System.out.println("da tat dieu hoa");
    }
}
