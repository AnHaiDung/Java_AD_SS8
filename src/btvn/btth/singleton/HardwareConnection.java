package btvn.btth.singleton;

import java.util.Scanner;

public class HardwareConnection {
    private static HardwareConnection instance;
    private HardwareConnection(){

    }
    public static HardwareConnection getInstance(){
        if (instance == null){
            instance = new HardwareConnection();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Da ket noi");
    }

    public void close(){
        System.out.println("ngat ket noi");
    }
}
