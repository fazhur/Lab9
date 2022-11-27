package ua.edu.ucu.apps.flowerstore.decorator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import java.util.List;

@RequestMapping(path="decoration")
@RestController

public class DecoratorController {
    @GetMapping
    public List<ItemDecorator> test(){
        Flower romashka = new Flower(10, 2, FlowerColor.WHITE, 15.5, FlowerType.CHAMOMILE);
        Flower cactus = new Flower(11, 0.0, FlowerColor.GREEN, 37.2, FlowerType.CACTUS);
        Flower rose = new Flower(12, 2.3, FlowerColor.RED, 50, FlowerType.ROSE);
        ItemDecorator paper = new PaperDecorator(rose);
        ItemDecorator basket = new BasketDecorator(cactus);
        ItemDecorator ribbon = new RibbonDecorator(romashka);
        return List.of(paper, basket, ribbon);
    }
}
