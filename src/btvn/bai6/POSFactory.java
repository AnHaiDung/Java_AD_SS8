package btvn.bai6;

import java.util.Scanner;

public class POSFactory implements SalesChannelFactory {
    public DiscountStrategy createDiscountStrategy() { return amount -> amount * 0.05; } // Giảm 5%
    public PaymentMethod createPaymentMethod() { return amount -> System.out.println("Xử lý thanh toán Tiền mặt (COD): " + amount); }
    public NotificationService createNotificationService() { return msg -> System.out.println("In hóa đơn tại quầy: " + msg); }
}
