package seminars.five.order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {
//    У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и
//    PaymentService. Класс OrderService обрабатывает заказы и делает вызовы к
//    PaymentService для обработки платежей. Ваша задача - написать интеграционный тест,
//    который проверяет, что OrderService и PaymentService взаимодействуют корректно

    @Test
    void integrationTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        // Симуляция успешного платежа
        boolean isOrderPlaced = orderService.placeOrder("1", 2.00);
        assertThat(isOrderPlaced).isTrue();

        // Симуляция неудачного платежа
        paymentService.setSimulatePaymentFailure(true);
        isOrderPlaced = orderService.placeOrder("2", 2.00);
        assertThat(isOrderPlaced).isFalse();
    }
}
