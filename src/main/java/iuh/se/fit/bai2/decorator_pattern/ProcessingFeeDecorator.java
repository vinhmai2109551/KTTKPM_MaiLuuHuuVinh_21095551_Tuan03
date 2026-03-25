package iuh.se.fit.bai2.decorator_pattern;
//(Phí xử lý)
public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment payment) { super(payment); }

    @Override
    public double getCost() { return super.getCost() + 5.0; } // Cộng thêm 5đ phí

    @Override
    public String getDescription() { return super.getDescription() + " + Phí xử lý (5.0)"; }
}