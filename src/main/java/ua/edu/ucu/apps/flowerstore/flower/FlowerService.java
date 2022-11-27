package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private static FlowerRepository flowerRepository;
    @Autowired
    FlowerService (FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        Flower romashka = new Flower();
        romashka.setSepalLength(20);
        romashka.setFlowerType(FlowerType.CHAMOMILE);
        romashka.setColor(FlowerColor.WHITE);
        romashka.setPrice(15);
        Flower cactus = new Flower();
        cactus.setSepalLength(0);
        cactus.setFlowerType(FlowerType.CACTUS);
        cactus.setColor(FlowerColor.GREEN);
        cactus.setPrice(500);
        Flower rose = new Flower();
        rose.setSepalLength(40);
        rose.setFlowerType(FlowerType.ROSE);
        rose.setColor(FlowerColor.RED);
        rose.setPrice(40);
        flowerRepository.save(rose);
        flowerRepository.save(cactus);
        flowerRepository.save(romashka);
        flowerRepository.save(new Flower());
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
