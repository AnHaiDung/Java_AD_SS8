package btvn.btth.apdater;

import java.util.Scanner;

public class TemperatureAdapter implements TemperatureSensor{
    private OldThermometer old;
    public TemperatureAdapter(OldThermometer old){
        this.old = old;
    }

    @Override
    public double getTemperatureCelsius() {
        return (old.getTemperatureFahrenheit()-32)/1.8;
    }
}
