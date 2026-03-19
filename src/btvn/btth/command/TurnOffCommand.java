package btvn.btth.command;

import btvn.btth.factory.Device;

import java.util.Scanner;

public class TurnOffCommand implements Command{
    private Device device;
    public void setDevice(Device device){
        this.device = device;
    }
    @Override
    public void excute() {
        device.turnOff();
    }

    @Override
    public void undo() {
        device.turnOn();
    }

    @Override
    public void redo() {
        device.turnOn();
    }
}
