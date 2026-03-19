package btvn.bai3;

import java.util.Scanner;

public class ACSetTemperatureCommand  implements Command {
    private AirConditioner ac;
    private int newTemp;
    private int previousTemp;
    public ACSetTemperatureCommand (AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
        this.previousTemp = ac.getTemp();
    }

    @Override
    public void execute() {
        previousTemp = ac.getTemp();
        ac.setTemp(newTemp);
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.setTemp(previousTemp);
        System.out.println("(undo) nhiệt độ điều hòa trở về: " + previousTemp);
    }
}
