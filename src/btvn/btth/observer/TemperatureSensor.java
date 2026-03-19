package btvn.btth.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureSensor {
    private List<Observer> receiver = new ArrayList<>();
    public void add(Observer o){
        receiver.add(o);
    }
    public void sendInfor(String infor){
        for (Observer observer: receiver){
            observer.update(infor);
        }
    }
}
