package btvn.bai1;

import java.util.Scanner;

public class AirConditionerFactory extends DeviceFactory{
    @Override
    public Device createDevice() {
        return new AirConditioner();
    }
}
