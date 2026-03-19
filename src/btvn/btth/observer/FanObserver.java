package btvn.btth.observer;

import java.util.Scanner;

public class FanObserver implements Observer{

    @Override
    public void update(String infor) {
        System.out.println("quat da nhan cam bien "+ infor);
    }
}
