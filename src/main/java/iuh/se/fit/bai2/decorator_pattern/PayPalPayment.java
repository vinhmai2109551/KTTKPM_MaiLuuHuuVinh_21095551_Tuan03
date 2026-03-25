package iuh.se.fit.bai2.decorator_pattern;

public class PayPalPayment implements Payment {
    @Override
    public double getCost() { return 100.0; }

    @Override
    public String getDescription() { return "Thanh toán bằng PayPal"; }
}