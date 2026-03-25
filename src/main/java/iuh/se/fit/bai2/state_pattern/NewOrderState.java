package iuh.se.fit.bai2.state_pattern;
public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("Hành vi: Kiểm tra thông tin đơn hàng.");
        // Sau khi kiểm tra xong, tự động chuyển sang trạng thái tiếp theo [cite: 808]
        context.setState(new ProcessingState());
    }

    @Override
    public String getStatusName() { return "Mới tạo"; }
}