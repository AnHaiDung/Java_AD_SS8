package btvn.bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureSensor {
    private List<Observer> observers = new ArrayList<>();
    private int currentTemp;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setTemperature(int temp) {
        this.currentTemp = temp;
        System.out.println("\n[Cảm biến]: Nhiệt độ môi trường hiện tại là " + temp + "°C");
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(currentTemp);
        }
    }
}
