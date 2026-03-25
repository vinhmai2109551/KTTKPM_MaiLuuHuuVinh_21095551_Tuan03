package iuh.se.fit.bai2.state_pattern;

public interface OrderState {
    void handle(OrderContext context);
    String getStatusName();
}
