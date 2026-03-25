package iuh.se.fit.bai2.state_pattern;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        // Trạng thái mặc định ban đầu là "Mới tạo"
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void apply() {
        System.out.println("--- Trạng thái hiện tại: " + state.getStatusName() + " ---");
        state.handle(this);
    }
}