package iuh.se.fit.bai2.strategy_pattern;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy strategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = strategy;
    }

    public void setTaxStrategy(TaxStrategy strategy) {
        this.taxStrategy = strategy;
    }

    public double calculateTotalPrice() {
        double tax = taxStrategy.calculateTax(price);
        return price + tax;
    }

    public void displayInfo() {
        System.out.println("Sản phẩm: " + name + " | Giá gốc: " + price + " | Tổng sau thuế: " + calculateTotalPrice());
    }
}