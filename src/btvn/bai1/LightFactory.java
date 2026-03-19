package btvn.bai1;

import java.util.Scanner;

public class LightFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        return new Light();
    }
}
