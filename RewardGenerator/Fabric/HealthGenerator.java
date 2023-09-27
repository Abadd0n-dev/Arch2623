package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.HealthReward;

public class HealthGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new HealthReward();
    }
    
}
