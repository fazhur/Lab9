package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.general.Order;

import java.util.List;

@RequestMapping(path="payment")
@RestController

public class PaymentController {
    @GetMapping
    public List<ContextPayment> test(){
        ContextPayment payment = new ContextPayment(new Order(), 150);
//        payment.setStrategy(new PayPalPaymentStrategy());
        return List.of(payment);
    }
}
