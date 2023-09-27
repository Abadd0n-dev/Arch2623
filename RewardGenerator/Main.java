package RewardGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import RewardGenerator.Fabric.ArrowsGenerator;
import RewardGenerator.Fabric.GemGenerator;
import RewardGenerator.Fabric.GoldGenerator;
import RewardGenerator.Fabric.HealthGenerator;
import RewardGenerator.Fabric.HelmetGenerator;
import RewardGenerator.Fabric.ItemGenerator;
import RewardGenerator.Fabric.ManaGenerator;
import RewardGenerator.Fabric.ShieldGenerator;
import RewardGenerator.Fabric.SilverGenerator;

public class Main {
    public static void main(String[] args) {
        
        ItemGenerator a1 = new GemGenerator();
        a1.openReward();

        ItemGenerator a2 = new GoldGenerator();
        a2.openReward();

        ItemGenerator a3 = new SilverGenerator();
        a3.openReward();

        ItemGenerator a4 = new ArrowsGenerator();
        a4.openReward();

        ItemGenerator a5 = new HealthGenerator();
        a5.openReward();

        ItemGenerator a6 = new HelmetGenerator();
        a6.openReward();

        ItemGenerator a7 = new ManaGenerator();
        a7.openReward();

        ItemGenerator a8 = new ShieldGenerator();
        a8.openReward();

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();

        itemGeneratorList.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            itemGeneratorList.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            itemGeneratorList.add(new SilverGenerator());
            itemGeneratorList.add(new ArrowsGenerator());
            itemGeneratorList.add(new HealthGenerator());
            itemGeneratorList.add(new HelmetGenerator());
            itemGeneratorList.add(new ManaGenerator());
            itemGeneratorList.add(new ShieldGenerator());
            itemGeneratorList.add(new GemGenerator());
        }

        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 200; i++) {
            int index = random.nextInt(itemGeneratorList.size());
            itemGeneratorList.get(index).openReward();
        }
        
    }
}
