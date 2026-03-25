package iuh.se.fit.bai2;

import iuh.se.fit.bai2.decorator_pattern.DiscountDecorator;
import iuh.se.fit.bai2.decorator_pattern.PayPalPayment;
import iuh.se.fit.bai2.decorator_pattern.Payment;
import iuh.se.fit.bai2.decorator_pattern.ProcessingFeeDecorator;
import iuh.se.fit.bai2.state_pattern.*;
import iuh.se.fit.bai2.strategy_pattern.Product;
import iuh.se.fit.bai2.strategy_pattern.SpecialTaxStrategy;
import iuh.se.fit.bai2.strategy_pattern.VATStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bai2Application {

    public static void main(String[] args) {//------------------------------------------------------------------------------------------------
        // Khởi tạo Spring Boot (giữ nguyên mặc định)
        SpringApplication.run(Bai2Application.class, args);

        System.out.println("\n=== MÔ PHỎNG QUY TRÌNH ĐƠN HÀNG (STATE PATTERN) ===");
        OrderContext order = new OrderContext();

        // Chạy quy trình tự động chuyển trạng thái
        order.apply(); // Trạng thái: Mới tạo -> Hành vi: Kiểm tra thông tin
        order.apply(); // Trạng thái: Đang xử lý -> Hành vi: Đóng gói
        order.apply(); // Trạng thái: Đã giao -> Hành vi: Cập nhật hệ thống

        System.out.println("\n=== THỬ NGHIỆM TRƯỜNG HỢP HỦY ĐƠN ===");
        OrderContext canceledOrder = new OrderContext();
        canceledOrder.setState(new CanceledState());
        canceledOrder.apply(); // Hành vi: Hủy và hoàn tiền
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== TÍNH TOÁN THUẾ SẢN PHẨM (STRATEGY PATTERN) ===");
        // Tạo một chiếc xe hơi với thuế đặc biệt (xa xỉ)
        Product car = new Product("BMW X5", 50000, new SpecialTaxStrategy());
        car.displayInfo();

        // Thay đổi chiến lược tính thuế sang VAT cho cùng một sản phẩm
        car.setTaxStrategy(new VATStrategy());
        System.out.println("Sau khi đổi sang thuế VAT:");
        car.displayInfo();
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== HỆ THỐNG THANH TOÁN (DECORATOR PATTERN) ===");

        // 1. Thanh toán gốc bằng PayPal
        Payment myPayment = new PayPalPayment();
        System.out.println(myPayment.getDescription() + " | Tổng: " + myPayment.getCost());

        // 2. Thêm Phí xử lý
        myPayment = new ProcessingFeeDecorator(myPayment);
        System.out.println(myPayment.getDescription() + " | Tổng: " + myPayment.getCost());

        // 3. Thêm tiếp Mã giảm giá (Lồng các Decorator)
        myPayment = new DiscountDecorator(myPayment);
        System.out.println(myPayment.getDescription() + " | Tổng: " + myPayment.getCost());

    }
}