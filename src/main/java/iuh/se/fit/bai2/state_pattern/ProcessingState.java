package iuh.se.fit.bai2.state_pattern;

public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Hành vi: Đóng gói và vận chuyển.");
    }

    @Override
    public String getStatusName() { return "Đang xử lý"; }
}