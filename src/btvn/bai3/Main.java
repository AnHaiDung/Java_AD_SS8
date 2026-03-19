package btvn.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remote.setCommand(1, new FanOnCommand(fan), new FanOffCommand(fan));

        while (true) {
            System.out.println("1. Bật đèn ");
            System.out.println("2. Tắt đèn ");
            System.out.println("3. Bật quạt ");
            System.out.println("4. Tắt quạt ");
            System.out.println("5. Đặt nhiệt độ điều hòa ");
            System.out.println("6. Undo lệnh cuối");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) break;

            switch (choice) {
                case 1:
                    remote.pressOnButton(0);
                    break;
                case 2:
                    remote.pressOffButton(0);
                    break;
                case 3:
                    remote.pressOnButton(1);
                    break;
                case 4:
                    remote.pressOffButton(1);
                    break;
                case 5:
                    System.out.print("Nhập nhiệt độ muốn đặt (°C): ");
                    int temp = sc.nextInt();
                    Command acCmd = new ACSetTemperatureCommand(ac, temp);
                    remote.setCommand(2, acCmd, null);
                    remote.pressOnButton(2);
                    break;
                case 6:
                    remote.undoLastCommand();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
