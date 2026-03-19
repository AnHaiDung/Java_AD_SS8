package btvn.btth.factory;

import java.util.Scanner;

public class LightDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("den da bat");
    }

    @Override
    public void turnOff() {
        System.out.println("den da tat");
    }
}
