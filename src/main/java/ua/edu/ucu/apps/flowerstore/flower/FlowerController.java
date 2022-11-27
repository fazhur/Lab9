package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="flower")
@RestController

public class FlowerController {
    private FlowerService flowerService;
    @Autowired
    FlowerController (FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping
    public List<Flower> test(){
        return flowerService.getFlowers();
    }
    @PostMapping
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
