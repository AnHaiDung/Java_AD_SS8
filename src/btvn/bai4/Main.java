package btvn.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        Fan fan = new Fan();
        Humidifier humidifier = new Humidifier();
        sensor.attach(fan);
        System.out.println("Quạt: Đã đăng ký nhận thông báo");
        sensor.attach(humidifier);
        System.out.println("Máy tạo ẩm: Đã đăng ký");
        sensor.setTemperature(18);
        sensor.setTemperature(26);
    }
}
