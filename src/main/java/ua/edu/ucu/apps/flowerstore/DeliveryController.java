package ua.edu.ucu.apps.flowerstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path="delivery")
@RestController

public class DeliveryController {
    @GetMapping
    public List<ContextDelivery> test(){
        ContextDelivery delivery = new ContextDelivery(new Order(), "Kozelnytska 2-a");
//        delivery.setStrategy(new DHLDeliveryStrategy());
        return List.of(delivery);
    }
}
