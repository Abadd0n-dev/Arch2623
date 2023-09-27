package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
    
}
