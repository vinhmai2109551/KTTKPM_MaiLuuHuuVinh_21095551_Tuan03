package iuh.se.fit.bai2.strategy_pattern;

public class SpecialTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.2;
    }
}