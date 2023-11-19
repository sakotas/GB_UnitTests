package seminars.five.order;

public class PaymentService {
    private boolean simulatePaymentFailure;

    public void setSimulatePaymentFailure(boolean simulatePaymentFailure) {
        this.simulatePaymentFailure = simulatePaymentFailure;
    }

    public boolean processPayment(String orderId, double amount) {
        // Имитация неудачного платежа в зависимости от состояния
        if (simulatePaymentFailure) {
            return false;
        }
        // Здесь обычно был бы код для обработки платежей, но для примера просто возвращаем true
        return true;
    }
}
