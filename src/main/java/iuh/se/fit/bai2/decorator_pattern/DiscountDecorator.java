package iuh.se.fit.bai2.decorator_pattern;
//(Mã giảm giá)
public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) { super(payment); }

    @Override
    public double getCost() { return super.getCost() - 10.0; } // Giảm 10đ

    @Override
    public String getDescription() { return super.getDescription() + " + Mã giảm giá (-10.0)"; }
}