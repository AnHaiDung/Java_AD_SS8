package btvn.bai5;

import java.util.Scanner;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.attach(fan);
        sensor.attach(ac);

        Command sleepMode = new SleepModeCommand(light, ac, fan);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Kích hoạt Chế độ ngủ (Sleep Mode)");
            System.out.println("2. Thay đổi nhiệt độ phòng (Giả lập)");
            System.out.println("3. Xem trạng thái thiết bị");
            System.out.println("0. Thoát");
            System.out.print("Chọn thao tác: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sleepMode.execute();
                    break;
                case 2:
                    System.out.print("Nhập nhiệt độ mới cảm biến đo được: ");
                    int temp = scanner.nextInt();
                    sensor.setTemperature(temp);
                    break;
                case 3:
                    System.out.println("rạng thái hiện tại");
                    System.out.println(fan.getStatus());
                    System.out.println(ac.getStatus());
                    break;
                case 0:
                    System.out.println("thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
