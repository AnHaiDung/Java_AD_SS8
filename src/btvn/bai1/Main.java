package btvn.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Device> devices = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HardwareConnection connection = HardwareConnection.getInstance();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Kết nối phần cứng");
            System.out.println("2. Tạo thiết bị mới");
            System.out.println("3. Bật/tắt thiết bị vừa tạo.");
            System.out.println("4. Thoát.");
            System.out.print("lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    connection.connect();
                    break;
                case 2:
                    System.out.println("Chọn loại: 1. Đèn  2. Quạt  3. Điều hòa");
                    int type = sc.nextInt();
                    DeviceFactory factory = null;
                    switch (type) {
                        case 1:
                            factory = new LightFactory();
                            break;
                        case 2:
                            factory = new FanFactory();
                            break;
                        case 3:
                            factory = new AirConditionerFactory();
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                            continue;
                    }
                    Device device = factory.createDevice();
                    devices.add(device);
                    break;
                case 3:
                    if (devices.isEmpty()) {
                        System.out.println("Chưa có thiết bị.");
                        break;
                    }
                    for (int i = 0; i < devices.size(); i++) {
                        System.out.println((i + 1) + ". Thiết bị " + (i + 1));
                    }
                    System.out.print("Chọn thiết bị: ");
                    int index = sc.nextInt() - 1;

                    System.out.println("1. Bật");
                    System.out.println("2. Tắt");
                    System.out.print("Chọn: ");
                    int action = sc.nextInt();

                    if (action == 1) {
                        devices.get(index).turnOn();
                    } else if (action == 2) {
                        devices.get(index).turnOff();
                    } else {
                        System.out.println("khong hop le");
                    }
                    break;
                case 4:
                    System.out.println("Thoat chương trình");
                    return;
                default:
                    throw new IllegalArgumentException("khong hop le");
            }
        }
    }
}
