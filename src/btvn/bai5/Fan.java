package btvn.bai5;

import java.util.Scanner;

public class Fan implements Observer{
    private String speed = "Tắt";
    public void setLowSpeed() {
        this.speed = "Thấp";
        System.out.println("Quạt: Chạy tốc độ THẤP");
    }
    @Override
    public void update(int temp) {
        if (temp > 30) {
            this.speed = "Mạnh";
            System.out.println("Quạt: Nhiệt độ cao ("+temp+"°C), tự động chạy tốc độ MẠNH");
        }
    }

    public String getStatus() { return "Quạt đang ở tốc độ: " + speed; }
}
