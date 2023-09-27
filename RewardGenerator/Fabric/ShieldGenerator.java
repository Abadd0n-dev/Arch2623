package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.ShieldReward;

public class ShieldGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new ShieldReward();
    }
    
}
