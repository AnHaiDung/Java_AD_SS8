package btvn.bai2;

import java.util.Scanner;

public class SmartHomeFacade {
    private TemperatureSensor sensor;

    public SmartHomeFacade(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public void leaveHome() {
        System.out.println("""
                FACADE: Tắt đèn
                FACADE: Tắt quạt
                FACADE: Tắt điều hòa
                """);
    }

    public void sleepMode() {
        System.out.println("""
                FACADE: Tắt đèn
                FACADE: Điều hòa set 28°C
                FACADE: Quạt chạy tốc độ thấp
                """);
    }

    public void getCurrentTemperature() {
        double temp = sensor.getTemperatureCelsius();
        System.out.println("Nhiệt độ hiện tại: " + temp + "°C");
    }
}
