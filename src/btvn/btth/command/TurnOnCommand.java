package btvn.btth.command;

import btvn.bai1.Light;
import btvn.btth.factory.Device;

import java.util.Scanner;

public class TurnOnCommand implements Command{
    private Device device;
    public void setDevice(Device device){
        this.device = device;
    }
    @Override
    public void excute() {
        device.turnOn();
    }

    @Override
    public void undo() {
        device.turnOff();
    }

    @Override
    public void redo() {
        device.turnOff();
    }
}
