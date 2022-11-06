package ua.edu.ucu.apps.flowerstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path="flower")
@RestController

public class FlowerController {
    @GetMapping
    public List<Flower> test(){
        Flower romashka = new RomashkaFlower(2, 15.5);
        Flower cactus = new CactusFlower(37.2);
        Flower rose = new Flower(2.3, FlowerColor.RED, 50, FlowerType.ROSE);
        return List.of(romashka, cactus, rose);
    }
}
