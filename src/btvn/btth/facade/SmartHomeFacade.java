package btvn.btth.facade;

import btvn.btth.factory.AirConditioner;
import btvn.btth.factory.Device;
import btvn.btth.factory.LightDevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartHomeFacade {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device){
        devices.add(device);
    }

    public void sleepMode(){
        for(Device device : devices){
            //        neu la den thi tat
            if (device instanceof LightDevice){
                device.turnOff();
            }else if(device instanceof AirConditioner){
                device.turnOn();
            }
        }
    }
    public void leaveHomeMode(){
        for (Device device: devices){
            device.turnOff();
        }
    }
}
