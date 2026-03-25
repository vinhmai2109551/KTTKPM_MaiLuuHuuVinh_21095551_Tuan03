package iuh.se.fit.bai2.decorator_pattern;

public abstract class PaymentDecorator implements Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment payment) {
        this.decoratedPayment = payment;
    }

    @Override
    public double getCost() { return decoratedPayment.getCost(); }

    @Override
    public String getDescription() { return decoratedPayment.getDescription(); }
}