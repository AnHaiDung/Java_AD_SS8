package btvn.bai1;

import java.util.Scanner;

public class FanFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        return new Fan();
    }
}
