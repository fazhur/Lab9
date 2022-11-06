package ua.edu.ucu.apps.flowerstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path="decoration")
@RestController

public class DecoratorController {
    @GetMapping
    public List<ItemDecorator> test(){
        Flower romashka = new RomashkaFlower(2, 15.5);
        Flower cactus = new CactusFlower(37.2);
        Flower rose = new Flower(2.3, FlowerColor.RED, 50, FlowerType.ROSE);
        ItemDecorator paper = new PaperDecorator(rose);
        ItemDecorator basket = new BasketDecorator(cactus);
        ItemDecorator ribbon = new RibbonDecorator(romashka);
        return List.of(paper, basket, ribbon);
    }
}
