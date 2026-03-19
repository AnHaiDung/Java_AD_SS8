package btvn.bai6;

import java.util.Scanner;

public class MobileAppFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscountStrategy() { return amount -> amount * 0.15; } // Giảm 15%
    public PaymentMethod createPaymentMethod() { return amount -> System.out.println("Xử lý thanh toán MoMo: " + amount); }
    public NotificationService createNotificationService() { return msg -> System.out.println("Gửi Push Notification: " + msg); }
}
