package btvn.bai6;

import java.util.Scanner;

public class OrderService {
    private DiscountStrategy discountStrategy;
    private PaymentMethod paymentMethod;
    private NotificationService notificationService;

    public OrderService(SalesChannelFactory factory) {
        this.discountStrategy = factory.createDiscountStrategy();
        this.paymentMethod = factory.createPaymentMethod();
        this.notificationService = factory.createNotificationService();
    }

    public void processOrder(String product, double price, int quantity) {
        double total = price * quantity;
        double discount = discountStrategy.calculateDiscount(total);
        double finalAmount = total - discount;

        System.out.println("Sản phẩm: " + product + ", Số lượng: " + quantity);
        System.out.println("Áp dụng giảm giá: " + discount);
        paymentMethod.processPayment(finalAmount);
        notificationService.sendNotification("Đơn hàng cho " + product + " thành công!");
    }
}
