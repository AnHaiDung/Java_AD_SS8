package btvn.bai6;

import java.util.Scanner;

public class WebsiteFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscountStrategy() { return amount -> amount * 0.10; } // Giảm 10%
    public PaymentMethod createPaymentMethod() { return amount -> System.out.println("Xử lý thanh toán Thẻ tín dụng: " + amount); }
    public NotificationService createNotificationService() { return msg -> System.out.println("Gửi Email: " + msg); }
}
