package RewardGenerator.Fabric;

import RewardGenerator.Interface.IGameItem;
import RewardGenerator.Product.ArrowsReward;

public class ArrowsGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new ArrowsReward();
    }
    
}
