package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.GemReward;

public class GemGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
    
}
