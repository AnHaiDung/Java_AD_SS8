package btvn.bai5;

import java.util.Scanner;

public class AirConditioner implements Observer {
    private int targetTemp = 25;

    public void setTargetTemp(int temp) {
        this.targetTemp = temp;
        System.out.println("Điều hòa: Đã set " + temp + "°C");
    }

    @Override
    public void update(int temp) {
        if (temp > 30) {
            System.out.println("Điều hòa: Nhiệt độ phòng cao, tăng cường làm lạnh (giữ mức mục tiêu " + targetTemp + "°C)");
        }
    }

    public String getStatus() { return "Điều hòa đang set: " + targetTemp + "°C"; }
}
