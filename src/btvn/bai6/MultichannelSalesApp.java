package btvn.bai6;

import java.util.Scanner;

public class MultichannelSalesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesChannelFactory factory = null;

        System.out.println("Chọn kênh bán hàng: 1. Website | 2. Mobile App | 3. POS");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                factory = new WebsiteFactory();
                System.out.println("Bạn đã chọn kênh Website");
                break;
            case 2:
                factory = new MobileAppFactory();
                System.out.println("Bạn đã chọn kênh Mobile App");
                break;
            case 3:
                factory = new POSFactory();
                System.out.println("Bạn đã chọn kênh POS");
                break;
        }

        if (factory != null) {
            OrderService orderService = new OrderService(factory);
            orderService.processOrder("Laptop", 15000000, 1);
        }
    }
}
