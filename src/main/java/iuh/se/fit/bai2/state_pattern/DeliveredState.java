package iuh.se.fit.bai2.state_pattern;

public class DeliveredState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Hành vi: Cập nhật trạng thái đơn hàng là đã giao.");
    }

    @Override
    public String getStatusName() { return "Đã giao"; }
}