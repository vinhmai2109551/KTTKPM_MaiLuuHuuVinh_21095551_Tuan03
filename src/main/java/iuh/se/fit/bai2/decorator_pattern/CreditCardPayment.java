package iuh.se.fit.bai2.decorator_pattern;

public class CreditCardPayment implements Payment {
    @Override
    public double getCost() { return 100.0; } // Giả sử số tiền gốc là 100

    @Override
    public String getDescription() { return "Thanh toán bằng Thẻ tín dụng"; }
}