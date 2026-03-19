package btvn.btth.command;

import btvn.btth.factory.AirConditioner;
import btvn.btth.factory.Device;

import java.util.Scanner;

public class ChangeTemperatureCommand implements Command{
    private AirConditioner device;
    public void setDevice(AirConditioner device){
        this.device = device;
    }
    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

    public void increment(){
        device.setTemp(device.getTemp()+1);
    }
    public void decrement(){
        device.setTemp(device.getTemp()-1);
    }
}
