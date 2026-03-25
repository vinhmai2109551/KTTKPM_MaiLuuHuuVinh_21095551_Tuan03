package iuh.se.fit.bai2.state_pattern;

public class CanceledState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Hành vi: Hủy đơn hàng và hoàn tiền.");
    }

    @Override
    public String getStatusName() { return "Đã hủy"; }
}