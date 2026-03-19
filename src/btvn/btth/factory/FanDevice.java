package btvn.btth.factory;

import java.util.Scanner;

public class FanDevice implements Device{

    @Override
    public void turnOn() {
        System.out.println("da bat quat");
    }

    @Override
    public void turnOff() {
        System.out.println("da tat quat");
    }
}
