package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.SilverReward;

public class SilverGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
    
}
